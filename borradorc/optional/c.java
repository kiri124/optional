package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class c {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Laptop", 1200.0, "Electrónica"));
        productos.add(new Producto("Teléfono", 800.0, "Electrónica"));
        productos.add(new Producto("Camiseta", 25.0, "Ropa"));
        productos.add(new Producto("Zapatos", 80.0, "Ropa"));
        productos.add(new Producto("Libro", 15.0, "Libros"));
productos.add(new Producto("toyota", 400, "chelines"));

        // Buscar un producto por nombre
        String nombreBuscado = "toyotaaa";
        Optional<Producto> productoEncontrado = buscarProductoPorNombre(productos, nombreBuscado);
//Optional<Producto> productoEncontrado = buscarProductoPorNombre()
        if (productoEncontrado.isPresent()) {
            System.out.println("Producto encontrado: " + productoEncontrado.get());
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
    private static Optional<Producto> buscarProductoPorNombre(List<Producto> productos, String nombre) {
        return productos.stream()
                .filter(producto -> producto.getNombre().equals(nombre))
                .findFirst();
    }
}
