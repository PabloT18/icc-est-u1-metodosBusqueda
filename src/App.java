import java.util.Scanner;

/**
 * Author: Pablo Andrés Torres
 */
public class App {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();

        // int[] arreglo = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
        int[] arreglo = new int[50];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i + 1;
        }
        // Realizar la búsqueda secuencial
        metodosBusqueda.printArreglo(arreglo);

        // Ingresar el valor a buscar
        int valorBuscado = leerEnteroValido(scanner, "Ingrese el valor a buscar: ", true);

        // Realizar la búsqueda secuencial
        long startTime = System.nanoTime();
        int resultado = metodosBusqueda.busquedaSecuencial(arreglo, valorBuscado);
        long endTime = System.nanoTime();
        System.out
                .println("Tiempo de ejecución de la búsqueda secuencial: " + (endTime - startTime) + " nanosegundos.");

        // Mostrar el resultado de la búsqueda
        if (resultado != -1) {
            System.out.println("El valor " + valorBuscado + " se encuentra en la posición " + resultado + ".");
        } else {
            System.out.println("El valor " + valorBuscado + " no se encuentra en el arreglo.");
        }

        // Realizar la búsqueda secuencial
        long startTimeBinaria = System.nanoTime();
        int resultadoBinaria = metodosBusqueda.busquedaBinaria(arreglo, valorBuscado);
        long endTimeBinaria = System.nanoTime();
        System.out.println("Tiempo de ejecución de la búsqueda binaria: " + (endTimeBinaria - startTimeBinaria)
                + " nanosegundos.");

        // Mostrar el resultado de la búsqueda
        if (resultadoBinaria != -1) {
            System.out.println("El valor " + valorBuscado + " se encuentra en la posición " + resultado + ".");
        } else {
            System.out.println("El valor " + valorBuscado + " no se encuentra en el arreglo.");
        }

        scanner.close();
    }

    /**
     * Lee un número entero válido desde la entrada estándar.
     * 
     * @param scanner           El objeto Scanner utilizado para leer la entrada del
     *                          usuario.
     * @param mensaje           El mensaje que se mostrará al usuario solicitando la
     *                          entrada.
     * @param permitirNegativos Indica si se permiten números negativos.
     * @return El número entero válido ingresado por el usuario.
     */
    public static int leerEnteroValido(Scanner scanner, String mensaje, boolean permitirNegativos) {
        int numero;
        while (true) {
            System.out.print(mensaje);
            if (scanner.hasNextInt()) {
                numero = scanner.nextInt();
                if (!permitirNegativos && numero < 0) {
                    System.out.println("No se permiten números negativos. Por favor, ingrese un número positivo.");
                } else {
                    break;
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
                scanner.next(); // Limpiar la entrada incorrecta
            }
        }
        return numero;
    }
}
