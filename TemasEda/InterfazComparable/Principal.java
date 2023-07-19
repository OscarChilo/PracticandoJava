package TemasEda.InterfazComparable;

import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("oscar", 23, 34553));
        alumnos.add(new Alumno("mariela", 23, 4222));
        alumnos.add(new Alumno("osman", 24, 441252));

        Collections.sort(alumnos);
        System.out.println(alumnos);
    }
}
