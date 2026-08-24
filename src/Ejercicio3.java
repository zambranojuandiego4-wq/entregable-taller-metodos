public class Ejercicio3 {

    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }


    public static void main(String[] args) {
        double area = calcularAreaRectangulo(5.5, 4.0);
        System.out.println("El área del rectángulo es: " + area);
    }
}
