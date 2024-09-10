/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.ui;

import java.util.Scanner;
import mx.SUAP.entidad.Profesores;
import mx.desarrollo.integracion.ServiceFacadeLocator;/**
 *
 * @author jesus
 */
public class ProfesorBeanUI {
    static private Profesores profesores;
    
    public ProfesorBeanUI() {
        profesores = new Profesores();
    }
    

    public void init() {
        
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProfesorBeanUI beanUI = new ProfesorBeanUI();
        
        System.out.print("Ingrese el nombre del profesor a eliminar: ");
        String nombre = scanner.nextLine();
        
        profesores.setNombre(nombre);
        
            //boolean eliminado = profesorhelper.deleteProfesor(profesores);
           boolean eliminado = ServiceFacadeLocator.getInstanceFacadeProfesores().deleteProfesores(profesores);
           if (eliminado) {
                System.out.println("Profesor eliminado con éxito.");
            } else {
                System.out.println("No se encontró el profesor.");
            }
        } 
}
