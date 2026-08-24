public class Ejercicio4 {


    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }


    public static void main(String[] args) {
        int num = 3;
        System.out.println("¿El número " + num + " es par?: " + esPar(num));
    }
}
