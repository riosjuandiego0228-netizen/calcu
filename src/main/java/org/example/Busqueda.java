package org.example;
import java.util.Arrays;

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




        // Método que divide el arreglo recursivamente
        public static void mergeSort(int[] arreglo) {
            int n = arreglo.length;

            // Caso base: si el arreglo tiene 1 o 0 elementos, ya está ordenado
            if (n < 2) {
                return;
            }

            int mitad = n / 2;
            int[] izquierdo = new int[mitad];
            int[] derecho = new int[n - mitad];

            // Llenar el arreglo izquierdo
            for (int i = 0; i < mitad; i++) {
                izquierdo[i] = arreglo[i];
            }

            // Llenar el arreglo derecho
            for (int i = mitad; i < n; i++) {
                derecho[i - mitad] = arreglo[i];
            }

            // Llamadas recursivas para dividir ambas mitades
            mergeSort(izquierdo);
            mergeSort(derecho);

            // Fusionar las mitades ordenadas
            fusionar(arreglo, izquierdo, derecho);
        }

        // Método que fusiona los arreglos ordenados
        public static void fusionar(int[] arreglo, int[] izquierdo, int[] derecho) {
            int i = 0, j = 0, k = 0;

            // Comparar elementos de ambos arreglos y ordenarlos en el arreglo original
            while (i < izquierdo.length && j < derecho.length) {
                if (izquierdo[i] <= derecho[j]) {
                    arreglo[k++] = izquierdo[i++];
                } else {
                    arreglo[k++] = derecho[j++];
                }
            }

            // Copiar los elementos restantes del arreglo izquierdo (si los hay)
            while (i < izquierdo.length) {
                arreglo[k++] = izquierdo[i++];
            }

            // Copiar los elementos restantes del arreglo derecho (si los hay)
            while (j < derecho.length) {
                arreglo[k++] = derecho[j++];
            }
        }
    }



