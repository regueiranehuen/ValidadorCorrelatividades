package domain;

import domain.personas.Alumno;
import domain.materias.Materia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class InscripcionTest {

    @Test
    public void carlosPuedeCursarAM2(){
        Alumno carlos = new Alumno();
        carlos.setNombreYApellido("Carlos Tevez");



        Materia am1 = new Materia();
        am1.setNombre("AMI");

        Materia aga = new Materia();
        aga.setNombre("AGA");

        Materia am2 = new Materia();
        am2.setNombre("AM2");

        Materia ayed = new Materia();
        ayed.setNombre("AyED");

        Materia proba = new Materia();
        proba.setNombre("PyE");

        carlos.setMateriasAprobadas(am1, aga);

        am2.setCorrelativas(am1, aga);
        proba.setCorrelativas(am1, aga);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(carlos);
        inscripcion.setMaterias(am2, proba);

        Assertions.assertTrue(inscripcion.aprobada());

    }



}