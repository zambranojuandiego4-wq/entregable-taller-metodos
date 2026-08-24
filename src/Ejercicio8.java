public class Ejercicio8 {

    public static int[] generarTablaMultiplicar(int numero) {
        int[] tabla = new int[10];
        for (int i = 0; i < 10; i++) {
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }


    public static void main(String[] args) {
        int base = 9;
        int[] resultados = generarTablaMultiplicar(base);

        System.out.print("Tabla del " + base + ": ");
        for (int valor : resultados) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}
