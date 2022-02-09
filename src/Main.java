import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author emili
 */
public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroBuscar;
        int n = 50;
        int numero[] = new int[n];
        int contador = 0;
        int comparar;
        //llenar el array list y solitcita tamanio
        System.out.println("Llenando el arreglo");

        //La clase random para generar los numeros aleatorios
        Random random = new Random();

        while (contador < n) {
            int temp = random.nextInt(150) + 1;
            int i;

            // comprovamos si ese valor ya existe en el array
            for (i = 0; i < n - 1; i++) {
                if (temp == numero[i]) {
                    break;
                }
            }
            // si no se encuentra, lo añadimos al array
            if (temp != numero[i]) {
                numero[contador++] = temp;
            }
        }

        // mostramos el array
        for (int i = 0; i < n; i++) {
            System.out.println(numero[i]);
        }

        // arreglando array
        for (int i = 0; i < numero.length; i++) {      
            for (int j = i + 1; j < numero.length; j++) {  
                int tmp2 = 0;                            
                if (numero[i] > numero[j]) {          
                    tmp2 = numero[i];              
                    numero[i] = numero[j];           
                    numero[j] = tmp2;
                }
            }
        }
        // Arreglados.............
         System.out.println("-----Array arreglado-----");
        for (int i = 0; i < numero.length; i++) {
            System.out.print(" "+numero[i]);
            
        }
        System.out.println("\n");
        // Metodo de busqueda
        System.out.println("buscar numero en busqueda binaria ingrese numero a buscar");
        numeroBuscar = entrada.nextInt();
        MetodoBusqueda buscar = new MetodoBusqueda();

        comparar = buscar.busquedaBinaria(numero, n, numeroBuscar);
        if (numero[comparar] == numeroBuscar) {
            System.out.println("numero encontrado");
        } 
        if (numero[comparar] == -1) {
            System.out.println("no existe el numero buscado");
        }

    }

}