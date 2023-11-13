package funcional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class daf {
    public static void main(String[] args) {
        Direccion direccion = new Direccion("Calle Principal", "aki", "Ciudad", 12345);
        NumeroCelular celular1 = new NumeroCelular("123-456-7890");
        NumeroCelular celular2 = new NumeroCelular("987-654-3210");

        List<EstudianteUniversitario> estudiantes = new ArrayList<>();

        // Creamos 15 instancias de EstudianteUniversitario
        estudiantes.add(new EstudianteUniversitario("Ana", 20, direccion));

        String nombreBuscado = "Ana";

        Optional<EstudianteUniversitario> estudianteEncontrado = buscarEstudiantePorNombre(estudiantes, nombreBuscado);

        // Ahora puedes hacer algo con estudianteEncontrado si está presente
        estudianteEncontrado.ifPresent(estudiante -> System.out.println("Estudiante encontrado: " + estudiante.getNombre()));
    }

    private static Optional<EstudianteUniversitario> buscarEstudiantePorNombre(
            List<EstudianteUniversitario> estudiantes, String nombreBuscado) {
        return estudiantes.stream()
                .filter(estudiante -> estudiante.getNombre().equals(nombreBuscado))
                .findFirst();
    }
}

  
        /*  estudiantes.add(new EstudianteUniversitario("Juan", 22, direccion, Arrays.asList(celular1, celular2), "Carrera2", "Apellido2"));
        estudiantes.add(new EstudianteUniversitario("María", 21, direccion, Arrays.asList(celular1, celular2), "Carrera3", "Apellido3"));
        estudiantes.add(new EstudianteUniversitario("Carlos", 23, direccion, Arrays.asList(celular1, celular2), "Carrera4", "Apellido4"));
        estudiantes.add(new EstudianteUniversitario("Laura", 22, direccion, Arrays.asList(celular1, celular2), "Carrera5", "Apellido5"));
        estudiantes.add(new EstudianteUniversitario("Diego", 24, direccion, Arrays.asList(celular1, celular2), "Carrera6", "Apellido6"));
        estudiantes.add(new EstudianteUniversitario("Sofia", 20, direccion, Arrays.asList(celular1, celular2), "Carrera7", "Apellido7"));
        estudiantes.add(new EstudianteUniversitario("Pedro", 21, direccion, Arrays.asList(celular1, celular2), "Carrera8", "Apellido8"));
        estudiantes.add(new EstudianteUniversitario("Valeria", 23, direccion, Arrays.asList(celular1, celular2), "Carrera9", "Apellido9"));
        estudiantes.add(new EstudianteUniversitario("Alejandro", 22, direccion, Arrays.asList(celular1, celular2), "Carrera10", "Apellido10"));
        estudiantes.add(new EstudianteUniversitario("Isabella", 25, direccion, Arrays.asList(celular1, celular2), "Carrera11", "Apellido11"));
        estudiantes.add(new EstudianteUniversitario("Miguel", 20, direccion, Arrays.asList(celular1, celular2), "Carrera12", "Apellido12"));
        estudiantes.add(new EstudianteUniversitario("Lucía", 21, direccion, Arrays.asList(celular1, celular2), "Carrera13", "Apellido13"));
        estudiantes.add(new EstudianteUniversitario("Mateo", 22, direccion, Arrays.asList(celular1, celular2), "Carrera14", "Apellido14"));
        estudiantes.add(new EstudianteUniversitario("Camila", 23, direccion, Arrays.asList(celular1, celular2), "Carrera15", "Apellido15"));
*/