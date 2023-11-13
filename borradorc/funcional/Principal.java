package funcional;
import java.util.*; 
import java.util.stream.Collectors;


public class Principal{
    public static void main(String[] args) {
        Direccion direccion = new Direccion("Calle Principal", "Ciudad", "lambayeqye", 12345);
        NumeroCelular celular = new NumeroCelular("123-456-7890");

        List<String> nombres = Arrays.asList("Ana", "Juan", "María", "Carlos", "Laura", "Diego", "Sofia", "Pedro", "Valeria", "Alejandro", "Isabella", "Miguel", "Lucía", "Mateo", "Camila");

        List<EstudianteUniversitario> estudiantes = nombres.stream()
         .map(nombre -> new EstudianteUniversitario("Ana", 20, "direccion", 9394455, "sistemas", "lucas"));
              /*  .map(nombre -> new EstudianteUniversitario(nombre, 20, direccion, Arrays.asList(celular)))
                .collect(Collectors.toList());*/
/* this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.celulares = celulares;
        this.carrera=carrera;
        this.apellido=apellido; */
                String nombreBuscado = "Juan";
        Optional<EstudianteUniversitario> estudiantePorNombre = getEstudiantePorNombre(estudiantes, nombreBuscado);
        estudiantePorNombre.ifPresent(System.out::println);

        // Obtener el estudiante por dirección
        Direccion direccionBuscada = new Direccion("Calle Principal", "Ciudad", "Lambayeque", "12345");
        Optional<EstudianteUniversitario> estudiantePorDireccion = getEstudiantePorDireccion(estudiantes, direccionBuscada);
        estudiantePorDireccion.ifPresent(System.out::println);

    }

    private static Optional<EstudianteUniversitario> getEstudiantePorDireccion(
            List<EstudianteUniversitario> estudiantes, Direccion direccionBuscada) {
        return null;
    }

    private static Optional<EstudianteUniversitario> getEstudiantePorNombre(List<EstudianteUniversitario> estudiantes,
            String nombreBuscado) {
        return null;
    }
}

