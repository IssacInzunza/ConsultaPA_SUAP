/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import mx.SUAP.entidad.Asignacion;
import mx.desarrollo.integracion.ServiceLocator;

/**
 *
 * @author lukki
 */
public class test {
    public static void main(String[] args) {
        List<Asignacion> listaUsuarios = new ArrayList();
       // listaUsuarios = ServiceLocator.getInstanceProfesoresDAO().findAll();
        
        for(Asignacion us : listaUsuarios){
            System.out.println("Correo: " + us.getIdAsignacion());
        }
    }
}
