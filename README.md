# Métodos de Búsqueda 

Este proyecto implementa dos fundamentales métodos de búsqueda en arreglos de enteros utilizando Java: **Búsqueda Secuencial** y **Búsqueda Binaria**. Además, incluye una tabla comparativa que resalta las diferencias clave entre ambos métodos y una explicación detallada del código proporcionado.

## Tabla de Contenidos

1. [Búsqueda Secuencial](#búsqueda-secuencial)
2. [Búsqueda Binaria](#búsqueda-binaria)
3. [Comparativa de Métodos de Búsqueda](#comparativa-de-métodos-de-búsqueda)
4. [Descripción del Código](#descripción-del-código)
5. [Cómo Ejecutar el Programa](#cómo-ejecutar-el-programa)
6. [Autor](#autor)

---

## Búsqueda Secuencial

### ¿Qué es la Búsqueda Secuencial?

La **Búsqueda Secuencial**, también conocida como **Búsqueda Lineal**, es uno de los métodos de búsqueda más simples y directos. Consiste en recorrer cada elemento de un arreglo desde el inicio hasta el final hasta encontrar el elemento deseado o hasta verificar todos los elementos sin éxito.

### ¿Cómo Funciona?

1. **Inicio de la Búsqueda:**
   - Comienza desde el primer elemento del arreglo.

2. **Comparación:**
   - Compara el elemento actual con el valor buscado.

3. **Resultado de la Comparación:**
   - **Si son iguales:** Retorna la posición del elemento encontrado.
   - **Si son diferentes:** Continúa con el siguiente elemento.

4. **Final de la Búsqueda:**
   - Si se recorre todo el arreglo sin encontrar el elemento, se concluye que el elemento no está presente.

### Ventajas y Desventajas

**Ventajas:**
- **Simplicidad:** Fácil de entender e implementar.
- **No Requiere Ordenar:** Funciona con arreglos ordenados y desordenados.

**Desventajas:**
- **Ineficiente para Grandes Datos:** Su complejidad temporal es O(n), lo que lo hace menos eficiente en arreglos grandes.
- **Desempeño Lineal:** No aprovecha ningún orden existente en el arreglo.

### Ejemplo de Uso

```java
int[] arreglo = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
int valorBuscado = 50;
int resultado = busquedaSecuencial(arreglo, valorBuscado);
// resultado = 4 (índice donde se encuentra el valor)
```

---

## Búsqueda Binaria

### ¿Qué es la Búsqueda Binaria?

La **Búsqueda Binaria** es un método de búsqueda eficiente que se utiliza en arreglos **ordenados**. A diferencia de la Búsqueda Secuencial, que recorre el arreglo de manera lineal, la Búsqueda Binaria divide repetidamente el arreglo en mitades, reduciendo significativamente el número de comparaciones necesarias para encontrar el elemento buscado.

### ¿Cómo Funciona?

1. **Requisito:**
   - El arreglo debe estar **ordenado** previamente.

2. **Proceso de Búsqueda:**
   - **Paso 1:** Determinar el índice medio del arreglo.
   - **Paso 2:** Comparar el elemento en el índice medio con el valor buscado.
     - **Si son iguales:** Retornar la posición del elemento.
     - **Si el valor buscado es menor:** Repetir la búsqueda en la mitad **izquierda** del arreglo.
     - **Si el valor buscado es mayor:** Repetir la búsqueda en la mitad **derecha** del arreglo.
   - **Paso 3:** Continuar dividiendo el subarreglo hasta encontrar el elemento o hasta que el subarreglo esté vacío.

3. **Terminación:**
   - Si el subarreglo se reduce a cero sin encontrar el elemento, se concluye que el elemento no está presente en el arreglo.

### Ventajas y Desventajas

**Ventajas:**
- **Alta Eficiencia:** Su complejidad temporal es O(log n), lo que lo hace mucho más eficiente que la Búsqueda Secuencial en arreglos grandes.
- **Menor Número de Comparaciones:** Reduce significativamente el número de comparaciones necesarias.

**Desventajas:**
- **Requiere Ordenar:** Solo puede aplicarse a arreglos que ya están ordenados.
- **No Es Estable:** Aunque la estabilidad no es una preocupación directa en la búsqueda, la ordenación previa puede afectar el orden original de los elementos.

### Ejemplo de Uso

```java
int[] arreglo = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 }};
int valorBuscado = 40;
int resultado = busquedaBinaria(arreglo, valorBuscado);
// resultado = 3 (índice donde se encuentra el valor)
```

---

## Comparativa de Métodos de Búsqueda

| Característica               | Búsqueda Secuencial            | Búsqueda Binaria              |
|------------------------------|---------------------------------|-------------------------------|
| **Requisito del Arreglo**    | No requiere ordenado           | Requiere arreglo ordenado     |
| **Complejidad Temporal**     | O(n)                            | O(log n)                      |
| **Complejidad Espacial**     | O(1)                            | O(1)                          |
| **Eficiencia**               | Ineficiente para grandes datos  | Muy eficiente para grandes datos |
| **Simplicidad**              | Muy simple de implementar       | Más complejo de implementar   |
| **Aplicaciones**             | Arreglos pequeños o desordenados | Arreglos grandes y ordenados  |

---

## Descripción del Código

El proyecto está estructurado en dos clases principales:

### 1. **Clase `App`**

Esta clase contiene el método `main` y maneja la interacción con el usuario. Su función principal es:

- **Inicializar el Arreglo:**
  - Crea un arreglo de enteros con valores secuenciales (por defecto de 1 a 50).

- **Mostrar el Arreglo:**
  - Utiliza el método `printArreglo` de la clase `MetodosBusqueda` para imprimir el arreglo.

- **Solicitar Valor a Buscar:**
  - Pide al usuario que ingrese el valor a buscar en el arreglo, validando que sea un número entero.

- **Realizar Búsqueda Secuencial:**
  - Mide el tiempo de ejecución de la búsqueda secuencial.
  - Muestra la posición del elemento si se encuentra, o indica que no está presente.

- **Realizar Búsqueda Binaria:**
  - Mide el tiempo de ejecución de la búsqueda binaria.
  - Muestra la posición del elemento si se encuentra, o indica que no está presente.

### 2. **Clase `MetodosBusqueda`**

Esta clase encapsula los métodos de búsqueda y utilitarios relacionados:

- **Método `busquedaSecuencial`:**
  - Realiza una búsqueda secuencial en el arreglo para encontrar un valor específico.
  
- **Método `busquedaBinaria`:**
  - Realiza una búsqueda binaria en un arreglo ordenado para encontrar un valor específico.

- **Método `printArreglo`:**
  - Imprime los elementos del arreglo en una sola línea, separados por espacios.

---

## Cómo Ejecutar el Programa

### Requisitos

- **Java Development Kit (JDK):** Asegúrate de tener instalado el JDK en tu sistema. Puedes descargarlo desde [aquí](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).

### Pasos para Compilar y Ejecutar

1. **Descargar el Código:**
   - Clona el repositorio o descarga los archivos `App.java` y `MetodosBusqueda.java`.

2. **Compilar las Clases:**
   - Abre una terminal o símbolo del sistema.
   - Navega hasta el directorio donde se encuentran los archivos `.java`.
   - Compila la clase `MetodosBusqueda`:
     ```bash
     javac MetodosBusqueda.java
     ```
   - Compila la clase `App`:
     ```bash
     javac App.java
     ```

3. **Ejecutar el Programa:**
   - Ejecuta la clase `App`:
     ```bash
     java App
     ```

### Ejemplo de Ejecución

```bash
Ingrese el valor a buscar: 25
Tiempo de ejecución de la búsqueda secuencial: 12345 nanosegundos.
El valor 25 se encuentra en la posición 24.
Tiempo de ejecución de la búsqueda binaria: 6789 nanosegundos.
El valor 25 se encuentra en la posición 24.
```

---

## Autor

**Pablo Andrés Torres**

## Contribute
To contribute to this project, please create a fork and send a pull request, or simply open an issue with your comments and suggestions.
