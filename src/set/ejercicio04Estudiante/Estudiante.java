/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set.ejercicio04Estudiante;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Estudiante {
    private int matricula;
    private String nombre;
    private String modulo;

    public Estudiante(int matricula, String nombre, String modulo) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.modulo = modulo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + this.matricula;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiante other = (Estudiante) obj;
        return this.matricula == other.matricula;
    }

    @Override
    public String toString() {

        return "Estudiante{" + "Matricula:" + matricula + ", Nombre:" + nombre + ", Modulo:" + modulo + '}';
    }
    

    
}
