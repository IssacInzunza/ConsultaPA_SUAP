/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import mx.SUAP.entidad.Profesores;
import mx.desarrollo.integracion.ServiceFacadeLocator;

/**
 *
 * @author lukki
 */
public class test {
    public static void main(String[] args) {
        
       Profesores profesores = ServiceFacadeLocator.getInstanceFacadeProfesores().findProfesoresById(1);
        
        if(profesores.getIdProfesor()!= null){
            System.out.println("Login exitoso con el correo: ");
        }else{
            System.out.println("No se encontro registro");
        }
    }
}
