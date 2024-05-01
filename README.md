# Documentación

Clase con algoritmos de ordenación QuickSort.

 * **Autor:** Raúl Gutiérrez Izquierdo

## `public static <T extends Comparable<T>> void quicksort(T[] tabla)`

Ordenación de objetos según el orden natural.

 * **Parámetros:**
   * `<T>` — Tipo de objetos que puedan ser comparados.
   * `tabla` — Tabla a ordenar
 * **Excepciones:** `NullPointerException` — Si el comparador o alguno de los objetos es

     nulo.

## `public static <T> void quicksort(T[] t, Comparator<? super T> c)`

Ordenación de objetos según el orden especificado por el comparador c.

 * **Parámetros:**
   * `<T>` — Tipo de objetos que puedan ser comparados.
   * `t` — Tabla a ordenar
   * `c` — Comparador usado para ordenar la tabla.
 * **Excepciones:**
   * `NullPointerException` — Si el comparador o alguno de los objetos es

     nulo.
   * `ClassCastException` — Si la tabla contiene elementos que no pueden ser

     comparados entre sí.

## `public static void quicksort(int[] t)`

Ordenación de números enteros.

 * **Parámetros:** `t` — Tabla de enteros a ordenar
 * **Excepciones:** `NullPointerException` — Si la tabla es nula.

## `private static <T extends Comparable<T>> void partTablas(T[] t, int ini, int fin)`

 * **Parámetros:**
   * `<T>` — Tipo de objetos que puedan ser comparados.
   * `t` — Tabla a particionar
   * `ini` — Inicio de la tabla a particionar
   * `fin` — Fin de la tabla a particionar
 * **Excepciones:** `NullPointerException` — Si alguno de los objetos es nulo.

## `private static <T> void partTablas(T[] t, int ini, int fin, Comparator<? super T> c)`

 * **Parámetros:**
   * `<T>` — Tipo de objetos que puedan ser comparados.
   * `t` — Tabla a particionar
   * `ini` — Inicio de la tabla a particionar
   * `fin` — Fin de la tabla a particionar
   * `c` — Comparador usado para ordenar la tabla.
 * **Excepciones:**
   * `NullPointerException` — Si el comparador o alguno de los objetos es

     nulo.
   * `ClassCastException` — Si la tabla contiene elementos que no pueden ser

     comparados entre sí.

## `private static void partTablas(int t[], int ini, int fin)`

 * **Parámetros:**
   * `t` — Tabla de enteros a ordenar
   * `ini` — Inicio de la tabla a particionar
   * `fin` — Fin de la tabla a particionar
 * **Excepciones:** `NullPointerException` — Si la tabla es nula.
