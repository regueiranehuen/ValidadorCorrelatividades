package domain;


import domain.materias.Materia;
import domain.personas.Alumno;
import lombok.Getter;
import lombok.Setter;

import java.util.*;
import java.util.stream.Collectors;

public class Inscripcion {
    @Setter
    @Getter
    private Alumno alumno;

    @Getter
    private ArrayList<Materia> materias = new ArrayList<>();

    public void setMaterias(Materia materia, Materia ... materiaN){
        materias.add(materia);
        materias.addAll(Arrays.asList(materiaN));
    }

    // Tengo que chequear si el alumno cumple con las correlativas
    public Boolean aprobada(){

        // Mapeo correlativas de materias de inscripcion a un set, ya que pueden repetirse
        Set<Materia> correlativas = materias.
                stream().
                flatMap(materia->materia.getCorrelativas().stream()).collect(Collectors.toSet());

        //correlativas.forEach(c->System.out.println(c.getNombre()));

        // Retorno si en la lista de materias aprobadas del alumno se encuentran todas las correlativas necesarias
        return alumno.getMateriasAprobadas().containsAll(correlativas);

    }

}
