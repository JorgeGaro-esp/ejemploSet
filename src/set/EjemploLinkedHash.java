/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class EjemploLinkedHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Set<String> frutas = new LinkedHashSet();
        frutas.add("Platano");
        frutas.add("Pera");
        frutas.add("Cereza");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
        frutas.add("Banana");
        System.out.println("");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
    
}
