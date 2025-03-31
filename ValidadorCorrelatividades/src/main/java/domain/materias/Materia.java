package domain.materias;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;

public class Materia {
    @Getter
    @Setter
    private String nombre;

    @Getter
    private ArrayList<Materia> correlativas = new ArrayList<>();
                                                    // varargs es un array variable
    public void setCorrelativas(Materia correlativa, Materia ... correlativaN){
        correlativas.add(correlativa);
        correlativas.addAll(Arrays.asList(correlativaN));
    }

}
