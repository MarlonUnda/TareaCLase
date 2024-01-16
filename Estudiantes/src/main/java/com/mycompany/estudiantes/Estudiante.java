/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estudiantes;

/**
 *
 * @author Marloon
 */
public class Estudiante extends Persona {
     private final String curso;
    private final String carrera;
    private final int nivel;

    public Estudiante(String nombre, int edad, String curso, String carrera, String email, int nivel) {
        super(nombre, edad, email);
        this.curso = curso;
        this.carrera = carrera;
        this.nivel = nivel;
    }

    public String getCurso() {
        return curso;
    }

    public String getCarrera() {
        return carrera;
    }

    public int getNivel() {
        return nivel;
    }
public void imprimirInformacion() {
        System.out.println("Estudiante (Name: " + getNombre() +
                "; Email: " + (getEmail() != null ? getEmail() : "email no proporcionado") +
                "; Edad: " + (getEdad() == -1 ? "Edad no definida" : getEdad()) +
                " ; Nivel: " + getNivel() +
                "; Carrera: " + (getCarrera() != null ? getCarrera() : "Carrera no proporcionada") +
                ")");
    }

}

