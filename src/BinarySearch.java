public class BinarySearch {
	
	
 
    public int binarySearch(int[] lista, int numero) {
         
        int inicio = 0;
        int fin = lista.length - 1;
        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;
            if (numero == lista[medio]) {
                return medio;
            }
            if (numero < lista[medio]) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }
        return -1;
    }
  
    public static void main(String[] args) {
         
        BinarySearch prueba = new BinarySearch();
        int[] prueba1 = {2, 4, 6, 8, 10, 12, 14, 16};
        System.out.println("Posicion del numero 14: "+prueba.binarySearch(prueba1, 14));
        int[] prueba2 = {6,34,78,123,432,900};
        System.out.println("posicion del numero 432: "+prueba.binarySearch(prueba2, 432));
    }
}