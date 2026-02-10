/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package set.Ejercicio04;

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
        
        estudiantes.add(new Estudiante(3,"Jorge","Programacion"));
        estudiantes.add(new Estudiante(4,"Adrian","Base de datos"));
        estudiantes.add(new Estudiante(1,"Fatma","Digitalizacion"));
        estudiantes.add(new Estudiante(2,"Luisa","Programacion"));
        estudiantes.add(new Estudiante(5,"Sergio","Base de datos"));
        estudiantes.add(new Estudiante(5,"Sergio","Base de datos"));
        
        for (Estudiante estudiante:estudiantes) {
            System.out.println(estudiante.toString());
        }
    
        System.out.println("Cantidad de estudiantes: " + estudiantes.size());
    }
    
}
