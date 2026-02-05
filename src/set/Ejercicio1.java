/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<Integer> lista = List.of(1, 7, 1, 3, 1, 4, 1, 5, 5);
        Set<Integer> numeros = new HashSet<>(lista);
        Iterator it = numeros.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
