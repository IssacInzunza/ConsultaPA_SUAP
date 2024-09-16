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
        
       Profesores profesores = ServiceFacadeLocator.getInstanceFacadeProfesores().findProfesoresById(1233);
        
        if(profesores.getIdProfesor()!= null){
            System.out.println(profesores.getIdProfesor());
            System.out.println(profesores.getNombre());
            System.out.println(profesores.getApellido());
            System.out.println(profesores.getRfc());
        }else{
            System.out.println("No se encontro registro aaa");
        }
    }
}
