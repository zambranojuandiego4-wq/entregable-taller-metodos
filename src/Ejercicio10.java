import java.util.ArrayList;

public class Ejercicio10 {


    public static void main(String[] args) {
        ArrayList<Producto> listaProductos = new ArrayList<>();
        GestorInventario gestor = new GestorInventario();


        gestor.agregarProducto(listaProductos, new Producto("Laptop", 5000000, 3));
        gestor.agregarProducto(listaProductos, new Producto("Mouse", 100000, 10));


        GestorInventario.mostrarInventario(listaProductos);


        double granTotal = GestorInventario.calcularValorTotalInventario(listaProductos);
        System.out.println("Valor total del inventario: $" + granTotal);
    }
}


class Producto {
    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
}

// Controlador del inventario
class GestorInventario {

    // Método de instancia
    public void agregarProducto(ArrayList<Producto> lista, Producto p) {
        lista.add(p);
    }

    // Método static
    public static double calcularValorTotalInventario(ArrayList<Producto> lista) {
        double total = 0;
        for (Producto p : lista) {
            total += p.getPrecio() * p.getCantidad();
        }
        return total;
    }

    // Método static
    public static void mostrarInventario(ArrayList<Producto> lista) {
        System.out.println("--- Inventario ---");
        for (Producto p : lista) {
            System.out.println("- " + p.getNombre() + " | Cantidad: " + p.getCantidad() + " | Precio: $" + p.getPrecio());
        }
    }
}
