public class MetodoBusqueda {
 /*busqueda binaria
        esto devuelve el inidice del elemento buscado, o bien -1 en caso de dalso
        */
    int busquedaBinaria(int lista[], int n, int clave){//donde int es la lista de enteros n es el tamaño del arreglo y clave es el valor a buscar
        int central, bajo, alto;
        int valorCentral;
        bajo=0;
        alto = n-1;
        int pasos=0;
        while(bajo <= alto){
            central = (bajo + alto)/2;
            valorCentral = lista[central];
            if(clave == valorCentral){
                pasos++;
                System.out.println(""+pasos);
                return central;
            }else if(clave < valorCentral){
                pasos++;
                System.out.println(""+pasos);
                alto = central-1;     
            }else{
                pasos++;
                System.out.println(""+pasos);
                bajo = central + 1; 
            }
        }
        return -1;
    }
    
}