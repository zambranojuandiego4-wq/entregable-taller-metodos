public class Ejercicio7 {

    public static double calcularPromedioClase(double[] calificaciones) {
        if (calificaciones == null || calificaciones.length == 0) return 0.0;
        double suma = 0;
        for (double nota : calificaciones) {
            suma += nota;
        }
        return suma / calificaciones.length;
    }


    public static void main(String[] args) {
        double[] notasGrupo = {4.0, 3.8, 4.5, 4.2};
        System.out.println("Promedio general del grupo: " + calcularPromedioClase(notasGrupo));
    }
}
