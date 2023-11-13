package imperativo;
public class MiClaseGenerica<T> {
    private T valor;

    public MiClaseGenerica(T valor) {
        this.valor = valor;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public static void main(String[] args) {
        // Usando la clase genérica con un Integer
MiClaseGenerica<Integer> enteroGenerico = new MiClaseGenerica<>(42);
System.out.println(enteroGenerico.getValor());

// Usando la clase genérica con una cadena de texto
MiClaseGenerica<String> cadenaGenerica = new MiClaseGenerica<>("Hola, mundo");
System.out.println(cadenaGenerica.getValor());

    }
}
