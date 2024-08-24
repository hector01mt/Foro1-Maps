package com.mycompany.ejemplomap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *1
 * @author Hector
 */
public class EjemploMap {

    public static void main(String[] args) {
        Map<String, Integer> CalificacionesAlumnos = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Menú:");
            System.out.println("1. Agregar alumno y calificacion");
            System.out.println("2. Mostrar todas las calificaciones");
            System.out.println("3. Buscar calificacion de un alumno");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            option = scanner.nextInt();
            scanner.nextLine();  

            switch (option) {
                case 1:
                    System.out.print("Ingresa el nombre del alumno: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Ingresa la calificacion: ");
                    int calificacion = scanner.nextInt();
                    CalificacionesAlumnos.put(nombre, calificacion);
                    System.out.println("Alumno y calificacion agregados.");
                    break;
                case 2:
                    System.out.println("Lista de alumnos y sus calificaciones:");
                    for (Map.Entry<String, Integer> entry : CalificacionesAlumnos.entrySet()) {
                        System.out.println("Estudiante: " + entry.getKey() + ", Calificacion: " + entry.getValue());
                    }
                    break;
                case 3:
                    System.out.print("Ingresa el nombre del estudiante para buscar su calificacion: ");
                    String buscarNombre = scanner.nextLine();
                    if (CalificacionesAlumnos.containsKey(buscarNombre)) {
                        System.out.println("Calificacion de " + buscarNombre + ": " + CalificacionesAlumnos.get(buscarNombre));
                    } else {
                        System.out.println("Alumno no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida. Porfavor intentalo de nuevo.");
            }
        } while (option != 4);

        scanner.close();
    
    }
}
