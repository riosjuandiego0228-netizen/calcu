package org.example;

public class Busqueda {
    public int buscar(int[] lista, int valor){
        int bajo=0;
        int alto =lista.length -1;

       while (bajo<=alto){
           int medio = bajo+(alto-bajo)/2;
           if (lista[medio]==valor) return medio;
           if (lista[medio]<valor)bajo=medio+1;
           else alto = medio-1;

       }
       return -1;
    }

    public class BubbleSort {
        public static void bubbleSort(int[] arr) {
            int n = arr.length;
            boolean intercambiado;

            // Bucle externo para recorrer todo el array
            for (int i = 0; i < n - 1; i++) {
                intercambiado = false;

                // Bucle interno para comparar elementos adyacentes
                for (int j = 0; j < n - 1 - i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        // Intercambio si el elemento actual es mayor que el siguiente
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                        intercambiado = true;
                    }
                }

                // Optimización: si no hubo intercambios, el array ya está ordenado
                if (!intercambiado) {
                    break;
                }
            }
        }

    }

}
