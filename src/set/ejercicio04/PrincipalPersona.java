/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package set.ejercicio04;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalPersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Set<Persona> personas = new HashSet<>();
        personas.add(new Persona("58443472N", "Joge"));
        personas.add(new Persona("12345678B", "Luisa"));
        personas.add(new Persona("12345678B", "Luisa"));

        for (Persona persona : personas) {
            persona.mostrar();
        }

    }

}
