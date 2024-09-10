/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import mx.desarrollo.DAO.AsignacionDAO;
import mx.SUAP.entidad.Asignacion;

/**
 *
 * @author lukki
 */
public class test {
    public static void main(String[] args) {
        List<Asignacion> listaUsuarios = new ArrayList();
        AsignacionDAO usuarioDao = new AsignacionDAO();
        listaUsuarios = usuarioDao.findAll();
        
        for(Asignacion us : listaUsuarios){
            System.out.println("Correo: " + us.getIdAsignacion());
        }
    }
}
