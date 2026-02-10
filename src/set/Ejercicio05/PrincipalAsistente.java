/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package set.Ejercicio05;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class PrincipalAsistente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set<Asistente> asistentes = new LinkedHashSet<>();
        
        asistentes.add(new Asistente("58443472N","Jorge"));
        asistentes.add(new Asistente("58443473J","Marta"));
        asistentes.add(new Asistente("00000000Z","Anonimo"));
        asistentes.add(new Asistente("12345678Y","Luisa"));
        asistentes.add(new Asistente("12345678Y","Luisa"));
        asistentes.add(new Asistente("87654321W","Pepe"));
        
        for (Asistente asistente:asistentes) {
            System.out.println(asistente.toString());
        }
        
        System.out.println("Cantidad de asistentes: " + asistentes.size());
    }
    
}
