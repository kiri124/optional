package funcional;
import java.util.List;

public class EstudianteTemporal {
    private String nombre;
    private int edad;
    private Direccion direccion;
    private List<NumeroCelular> celulares;

    public EstudianteTemporal(String nombre, int edad, Direccion direccion, List<NumeroCelular> celulares) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.celulares = celulares;
    }

    // Getters y setters para los atributos
}

