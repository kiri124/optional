package optional;

import java.util.Optional;
import java.util.ArrayList;
import java.util.List;

public class orElseT {
    public static void main(String[] args) {
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Laptop", 1200.0,""));
        listaProductos.add(new Producto("Teléfono", 500.0,""));
        listaProductos.add(new Producto("Tablet", 300.0,""));

        String nombreProductoBuscado = "Teléfono";
        Producto productoEncontrado = buscarProducto(listaProductos, nombreProductoBuscado)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado: " + nombreProductoBuscado));

        System.out.println("Producto encontrado: " + productoEncontrado);
    }

    private static Optional<Producto> buscarProducto(List<Producto> productos, String nombre) {
        return productos.stream()
                .filter(producto -> producto.getNombre().equals(nombre))
                .findFirst();
    }
}
