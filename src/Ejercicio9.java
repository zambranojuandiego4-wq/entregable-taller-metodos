public class Ejercicio9 {

    public static String clasificarNota(double nota) {
        if (nota >= 4.5) return "Excelente";
        if (nota >= 3.0) return "Aprobado";
        return "Reprobado";
    }


    public static void main(String[] args) {
        double miNota = 2.5;
        System.out.println("La nota " + miNota + " está clasificada como: " + clasificarNota(miNota));
    }
}
