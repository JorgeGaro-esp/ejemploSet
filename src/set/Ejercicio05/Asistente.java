/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set.Ejercicio05;

import java.util.Objects;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Asistente {
    private String dni;
    private String nombre;

    //Constructor

    public Asistente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    //Getter and Setter

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    //Metodos
    
    @Override
    public String toString() {
        return "Asistente{" + "Dni:" + dni + ", Nombre:" + nombre + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.dni);
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
        final Asistente other = (Asistente) obj;
        return Objects.equals(this.dni, other.dni);
    }
    
    
    
    
}
