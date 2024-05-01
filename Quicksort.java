import java.util.Comparator;

/**
 * Clase con algoritmos de ordenación QuickSort.
 * 
 * @author Raúl Gutiérrez Izquierdo
 */
public class Quicksort {

    /**
     * Ordenación de objetos según el orden natural.
     * @param <T>   Tipo de objetos que puedan ser comparados.
     * @param tabla Tabla a ordenar
     * @throws NullPointerException Si el comparador o alguno de los objetos es
     *                              nulo.
     */
    public static <T extends Comparable<T>> void quicksort(T[] tabla) {
        partTablas(tabla, 0, tabla.length - 1);
    }

    /**
     * Ordenación de objetos según el orden especificado por el comparador c.
     * @param <T> Tipo de objetos que puedan ser comparados.
     * @param t   Tabla a ordenar
     * @param c   Comparador usado para ordenar la tabla.
     * @throws NullPointerException Si el comparador o alguno de los objetos es
     *                              nulo.
     * @throws ClassCastException   Si la tabla contiene elementos que no pueden ser
     *                              comparados entre sí.
     */
    public static <T> void quicksort(T[] t, Comparator<? super T> c) {
        partTablas(t, 0, t.length - 1, c);
    }

    /**
     * Ordenación de números enteros.
     * @param t Tabla de enteros a ordenar
     * @throws NullPointerException Si la tabla es nula.
     */
    public static void quicksort(int[] t) {
        partTablas(t, 0, t.length - 1);
    }

    /**
     * 
     * @param <T> Tipo de objetos que puedan ser comparados.
     * @param t   Tabla a particionar
     * @param ini Inicio de la tabla a particionar
     * @param fin Fin de la tabla a particionar
     * @throws NullPointerException Si alguno de los objetos es nulo.
     */
    private static <T extends Comparable<T>> void partTablas(T[] t, int ini, int fin) {
        int pivote, izq, der;
        T aux;

        if (ini < fin) {
            pivote = (ini + fin) / 2;
            izq = ini;
            der = fin;

            while (izq <= der) {
                while (t[izq].compareTo(t[pivote]) < 0) {
                    izq++;
                } // Fin Mientras

                while (t[der].compareTo(t[pivote]) > 0) {
                    der--;
                } // Fin Mientras

                if (izq <= der) {
                    aux = t[izq];
                    t[izq] = t[der];
                    t[der] = aux;

                    izq++;
                    der--;
                } // Fin Si
            } // Fin Mientras

            partTablas(t, ini, der);
            partTablas(t, izq, fin);
        } // Fin Si
    }

    /**
     * 
     * @param <T> Tipo de objetos que puedan ser comparados.
     * @param t   Tabla a particionar
     * @param ini Inicio de la tabla a particionar
     * @param fin Fin de la tabla a particionar
     * @param c   Comparador usado para ordenar la tabla.
     * @throws NullPointerException Si el comparador o alguno de los objetos es
     *                              nulo.
     * @throws ClassCastException   Si la tabla contiene elementos que no pueden ser
     *                              comparados entre sí.
     */
    private static <T> void partTablas(T[] t, int ini, int fin, Comparator<? super T> c) {
        int izq, der, pivote;
        T aux;
        if (ini < fin) {
            pivote = (ini + fin) / 2;
            izq = ini;
            der = fin;

            while (izq <= der) {
                while (c.compare(t[izq], t[pivote]) < 0) {
                    izq++;
                } // Fin Mientras

                while (c.compare(t[der], t[pivote]) > 0) {
                    der--;
                } // Fin Mientras

                if (izq <= der) {
                    aux = t[izq];
                    t[izq] = t[der];
                    t[der] = aux;

                    izq++;
                    der--;
                } // Fin Si
            } // Fin Mientras

            partTablas(t, ini, der, c);
            partTablas(t, izq, fin, c);
        } // Fin Si
    }

    /**
     * 
     * @param t   Tabla de enteros a ordenar
     * @param ini Inicio de la tabla a particionar
     * @param fin Fin de la tabla a particionar
     * @throws NullPointerException Si la tabla es nula.
     */
    private static void partTablas(int t[], int ini, int fin) {
        int pivote, izq, der, aux;
        if (ini < fin) {
            pivote = (ini + fin) / 2;
            izq = ini;
            der = fin;

            while (izq <= der) {
                while (t[izq] < t[pivote]) {
                    izq++;
                } // Fin Mientras

                while (t[der] > t[pivote]) {
                    der--;
                } // Fin Mientras
                if (izq <= der) {
                    aux = t[izq];
                    t[izq] = t[der];
                    t[der] = aux;

                    izq++;
                    der--;
                } // Fin Si
            } // Fin Mientras

            partTablas(t, ini, der);
            partTablas(t, izq, fin);
        } // Fin Si
    }
}