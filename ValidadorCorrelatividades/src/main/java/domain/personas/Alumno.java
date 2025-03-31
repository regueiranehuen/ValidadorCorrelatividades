package domain.personas;

import domain.materias.Materia;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;

public class Alumno {
    @Setter
    @Getter
    private String nombreYApellido;

    @Getter
    private ArrayList<Materia> materiasAprobadas = new ArrayList<>();

    public void setMateriasAprobadas(Materia materia, Materia ... materiaN){
        materiasAprobadas.add(materia);
        materiasAprobadas.addAll(Arrays.asList(materiaN));
    }
}
