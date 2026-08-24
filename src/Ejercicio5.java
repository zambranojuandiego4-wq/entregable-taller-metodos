public class Ejercicio5 {

    public static double calcularPromedio(double nota1, double nota2) {
        return (nota1 + nota2) / 2.0;
    }


    public static double calcularPromedio(double[] notas) {
        if (notas == null || notas.length == 0) return 0.0;
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    // Método para ejecutar ambos
    public static void main(String[] args) {
        // Prueba versión 1
        System.out.println("Promedio de dos notas (4.0 y 5.0): " + calcularPromedio(4.0, 5.0));

        // Prueba versión 2
        double[] misNotas = {3.5, 4.2, 5.0};
        System.out.println("Promedio del arreglo de notas: " + calcularPromedio(misNotas));
    }
}
