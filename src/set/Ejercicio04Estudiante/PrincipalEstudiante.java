/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package set.Ejercicio04Estudiante;

import set.Ejercicio04Estudiante.Estudiante;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalEstudiante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Set<Estudiante> estudiantes = new HashSet<>();

        Estudiante e1 = new Estudiante(1, "Jorge", "Mo1");
        Estudiante e2 = new Estudiante(2, "Luisa", "Mo2");
        Estudiante e3 = new Estudiante(3, "Adrian", "Mo1");
        Estudiante e4 = new Estudiante(4, "Fatma", "Mo3");
        Estudiante e5 = new Estudiante(5, "Sergio", "Mo2");
        Estudiante e6 = new Estudiante(5, "Sergio", "Mo2");

        estudiantes.add(e1);
        estudiantes.add(e2);
        estudiantes.add(e3);
        estudiantes.add(e4);
        estudiantes.add(e5);
        estudiantes.add(e6);

        for (Estudiante estudiante : estudiantes) {
            System.out.println(estudiante.toString());
            System.out.println("");
        }

    }

}
