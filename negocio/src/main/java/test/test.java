/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import mx.SUAP.entidad.Asignacion;
import mx.SUAP.entidad.Profesores;
import mx.SUAP.entidad.UnidadDeAprendizaje;
import mx.desarrollo.integracion.ServiceLocator;
import java.util.Scanner;

/**
 *
 * @author lukki
 */
public class test {
    public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Ver Materias");
            System.out.println("2. Mostrar Profesores por Materia");
            System.out.println("3. Modificar Materia de un Profesor");
            System.out.println("4. Consulta General (Materias, Profesores, Asignaciones)");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    mostrarMaterias();
                    break;
                case 2:
                    mostrarProfesoresPorMateria(scanner);
                    break;
                case 3:
                    modificarMateriaDeProfesor(scanner);
                    break;
                case 4:
                    consultaGeneral();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (option != 5);
    }

    // Función para mostrar todas las materias
    public static void mostrarMaterias() {
        List<UnidadDeAprendizaje> listaMaterias = ServiceLocator.getInstanceUnidadDeAprendizajeDAO().findAll();
        if (listaMaterias.isEmpty()) {
            System.out.println("No hay materias registradas.");
        } else {
            System.out.println("=== Lista de Materias ===");
            for (UnidadDeAprendizaje materia : listaMaterias) {
                System.out.println("ID: " + materia.getIdUnidadAprendizaje() + ", Nombre: " + materia.getNombre());
            }
        }
    }

    // Función para mostrar profesores que imparten una materia
    public static void mostrarProfesoresPorMateria(Scanner scanner) {
        System.out.print("Ingrese el ID de la materia: ");
        int idMateria = scanner.nextInt();
        UnidadDeAprendizaje materia = ServiceLocator.getInstanceUnidadDeAprendizajeDAO().find(idMateria);

        if (materia == null) {
            System.out.println("Materia no encontrada.");
        } else {
            System.out.println("=== Profesores que imparten " + materia.getNombre() + " ===");
            List<Asignacion> asignaciones = ServiceLocator.getInstanceAsignacionDAO().findAll();
            boolean encontrado = false;

            for (Asignacion asignacion : asignaciones) {
                if (asignacion.getIdUDA().equals(materia)) {
                    Profesores profesor = asignacion.getIdProfesor();
                    System.out.println("Profesor: " + profesor.getNombre() + " " + profesor.getApellido());
                    encontrado = true;
                }
            }

            if (!encontrado) {
                System.out.println("No hay profesores asignados a esta materia.");
            }
        }
    }

    // Función para modificar la asignación de un profesor a una nueva materia
    public static void modificarMateriaDeProfesor(Scanner scanner) {
        System.out.print("Ingrese el ID del profesor que desea modificar: ");
        int idProfesor = scanner.nextInt();
        Profesores profesor = ServiceLocator.getInstanceProfesoresDAO().find(idProfesor);

        if (profesor == null) {
            System.out.println("Profesor no encontrado.");
            return;
        }

        System.out.print("Ingrese el ID de la nueva unidad de aprendizaje (materia): ");
        int idNuevaMateria = scanner.nextInt();
        UnidadDeAprendizaje nuevaMateria = ServiceLocator.getInstanceUnidadDeAprendizajeDAO().find(idNuevaMateria);

        if (nuevaMateria == null) {
            System.out.println("Unidad de aprendizaje no encontrada.");
            return;
        }

        // Encuentra la asignación existente y actualízala
        List<Asignacion> asignaciones = ServiceLocator.getInstanceAsignacionDAO().findAll();
        boolean asignacionExistente = false;

        for (Asignacion asignacion : asignaciones) {
            if (asignacion.getIdProfesor().equals(profesor)) {
                asignacion.setIdUDA(nuevaMateria);
                ServiceLocator.getInstanceAsignacionDAO().saveOrUpdate(asignacion);
                System.out.println("Asignación actualizada.");
                asignacionExistente = true;
                break;
            }
        }

        // Si no existe la asignación, creamos una nueva
        if (!asignacionExistente) {
            Asignacion nuevaAsignacion = new Asignacion();
            nuevaAsignacion.setIdProfesor(profesor);
            nuevaAsignacion.setIdUDA(nuevaMateria);
            ServiceLocator.getInstanceAsignacionDAO().saveOrUpdate(nuevaAsignacion);
            System.out.println("Nueva asignación creada.");
        }
    }

    // Nueva función para consultar las tres tablas
    public static void consultaGeneral() {
        List<Profesores> listaProfesores = ServiceLocator.getInstanceProfesoresDAO().findAll();
        List<UnidadDeAprendizaje> listaMaterias = ServiceLocator.getInstanceUnidadDeAprendizajeDAO().findAll();
        List<Asignacion> listadoAsignaciones = ServiceLocator.getInstanceAsignacionDAO().findAll();

        System.out.println("=== Consulta General ===");

        // Mostrar todas las materias
        System.out.println("=== Materias ===");
        for (UnidadDeAprendizaje materia : listaMaterias) {
            System.out.println("ID Materia: " + materia.getIdUnidadAprendizaje() + ", Nombre: " + materia.getNombre());
        }

        // Mostrar todos los profesores
        System.out.println("\n=== Profesores ===");
        for (Profesores profesor : listaProfesores) {
            System.out.println("ID Profesor: " + profesor.getIdProfesor() + ", Nombre: " + profesor.getNombre() + " " + profesor.getApellido());
        }

        // Mostrar todas las asignaciones
        System.out.println("\n=== Asignaciones ===");
        for (Asignacion asignacion : listadoAsignaciones) {
            System.out.println("ID Asignación: " + asignacion.getIdAsignacion() +
                               ", Profesor: " + asignacion.getIdProfesor().getNombre() +
                               ", Materia: " + asignacion.getIdUDA().getNombre());
        }
    }
}
