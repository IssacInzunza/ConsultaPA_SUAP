/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.delegate;
import java.util.List;
import mx.SUAP.entidad.Profesores;
import mx.SUAP.entidad.Usuarios;
import mx.desarrollo.integracion.ServiceLocator;
/**
 *
 * @author Johan
 */
public class DelegateUsuarios {
    public void saveUsuarios(Usuarios profesores){
        ServiceLocator.getInstanceUsuariosDAO().save(profesores);
    }
    public void saveUsuarioProfesor(Profesores nuevoProfesor, Usuarios nuevoUsuario){
        ServiceLocator.getInstanceUsuariosDAO().registrarProfesor(nuevoProfesor, nuevoUsuario);
    }
    public void updateUsuarios(Usuarios profesor) {
        ServiceLocator.getInstanceUsuariosDAO().update(profesor);
    }

    public void deleteUsuarios(Usuarios profesor) {
        ServiceLocator.getInstanceUsuariosDAO().delete(profesor);
    }

    public List<Usuarios> findAllUsuarios() {
        return ServiceLocator.getInstanceUsuariosDAO().findAll();
    }

    public Usuarios findUsuarioById(Integer id) {
        return ServiceLocator.getInstanceUsuariosDAO().find(id);
    }
}
