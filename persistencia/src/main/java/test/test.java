/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.ArrayList;
import java.util.List;
import mx.desarrollo.DAO.UsuariosDAO;
import mx.SUAP.entidad.Usuarios;

/**
 *
 * @author lukki
 */
public class test {
    public static void main(String[] args) {
        List<Usuarios> listaUsuarios = new ArrayList();
        UsuariosDAO usuarioDao = new UsuariosDAO();
        listaUsuarios = usuarioDao.findAll();
        
        for(Usuarios us : listaUsuarios){
            System.out.println("Usuario: " + us.getNombreDeUsuario());
        }
    }
}
