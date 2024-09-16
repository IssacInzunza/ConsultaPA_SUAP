/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.delegate;
import java.util.List;
import mx.desarrollo.integracion.ServiceLocator;
import mx.SUAP.entidad.Administradores;
/**
 *
 * @author Johan
 */
public class DelegateAdministradores {
    public void saveAdministradores(Administradores profesores){
        ServiceLocator.getInstanceAdministradoresDAO().save(profesores);
    }
    
    public void updateAdministradores(Administradores profesor) {
        ServiceLocator.getInstanceAdministradoresDAO().update(profesor);
    }

    public void deleteAdministradores(Administradores profesor) {
        ServiceLocator.getInstanceAdministradoresDAO().delete(profesor);
    }

    public List<Administradores> findAllAdministradores() {
        return ServiceLocator.getInstanceAdministradoresDAO().findAll();
    }

    public Administradores findAdministradorById(Integer id) {
        return ServiceLocator.getInstanceAdministradoresDAO().find(id);
    }
    
}
