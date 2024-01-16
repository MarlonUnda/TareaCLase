/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estudiantes;

/**
 *
 * @author Marloon
 */
public class Estudiantes {
public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Juan", 16, "Curso1", "Software", null, 1);
        Estudiante estudiante2 = new Estudiante("Martha", 19, "Curso2", "Mecanica", "martha@espe.edu.ec", 5);
        Estudiante estudiante3 = new Estudiante("Carlos", 17, "Curso3", "Electronica", null, 3);
        Estudiante estudiante4 = new Estudiante("Patricia", 20, "Curso4", "Petroquimica", "patty@espe.edu.ec", 8);

        estudiante1.imprimirInformacion();
        estudiante2.imprimirInformacion();
        estudiante3.imprimirInformacion();
        estudiante4.imprimirInformacion();
    }
}
  