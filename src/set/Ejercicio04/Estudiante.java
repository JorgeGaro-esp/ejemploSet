/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package set.Ejercicio04;

/**
 *
 * @author Jorge Garcia Rodriguez
 */
public class Estudiante {
    private int matricula;
    private String nombre;
    private String modulo;
    
    //Constructor

    public Estudiante(int matricula, String nombre, String modulo) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.modulo = modulo;
    }
    
    //Getter and Setter

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }
    
    //Metodos

    @Override
    public String toString() {
        return "Estudiante{" + "Matricula:" + matricula + ", Nombre:" + nombre + ", Modulo:" + modulo + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.matricula;
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
    
    
    
    
}
