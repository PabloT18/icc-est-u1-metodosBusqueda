/**
 * La clase MetodosBusqueda proporciona métodos para realizar búsquedas en
 * arreglos
 * y para imprimir los elementos de un arreglo.
 * 
 * Contiene los siguientes métodos:
 * - busquedaSecuencial: Realiza una búsqueda secuencial en un arreglo para
 * encontrar un valor específico.
 * - printArreglo: Imprime los elementos de un arreglo de enteros en la salida
 * estándar.
 */

/**
 * Author: Pablo Andrés Torres
 */
public class MetodosBusqueda {

    // Método para realizar la búsqueda secuencial
    /**
     * Realiza una búsqueda secuencial en un arreglo para encontrar un valor
     * específico.
     *
     * @param arreglo      El arreglo en el cual se realizará la búsqueda.
     * @param valorBuscado El valor que se desea encontrar en el arreglo.
     * @return La posición (índice) en el arreglo donde se encontró el valor
     *         buscado,
     *         o -1 si el valor no se encuentra en el arreglo.
     */
    public int busquedaSecuencial(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i; // Retorna la posición donde se encontró el valor
            }
        }
        return -1; // Retorna -1 si no se encuentra el valor
    }

    /**
     * Realiza una búsqueda binaria en un arreglo ordenado para encontrar el índice
     * de un valor específico.
     *
     * @param arreglo      El arreglo de enteros ordenado en el que se realizará la
     *                     búsqueda.
     * @param valorBuscado El valor entero que se desea buscar en el arreglo.
     * @return El índice del valor buscado en el arreglo si se encuentra; de lo
     *         contrario, retorna -1.
     */
    public int busquedaBinaria(int[] arreglo, int valorBuscado) {
        int inicio = 0;
        int fin = arreglo.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (arreglo[medio] == valorBuscado) {
                return medio; // Elemento encontrado
            }

            if (arreglo[medio] < valorBuscado) {
                inicio = medio + 1; // Buscar en la mitad derecha
            } else {
                fin = medio - 1; // Buscar en la mitad izquierda
            }
        }

        return -1; // Elemento no encontrado
    }

    /**
     * Imprime los elementos de un arreglo de enteros en una sola línea.
     * Cada elemento se separa por un espacio.
     *
     * @param arreglo El arreglo de enteros a imprimir.
     */
    public void printArreglo(int[] arreglo) {
        for (int elemento : arreglo) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
