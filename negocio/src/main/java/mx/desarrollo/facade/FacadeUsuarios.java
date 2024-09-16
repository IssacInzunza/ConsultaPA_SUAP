/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;

import java.util.List;
import mx.SUAP.entidad.Usuarios;
import mx.desarrollo.delegate.DelegateUsuarios;

/**
 *
 * @author Johan
 */
public class FacadeUsuarios {
    private final DelegateUsuarios delegateUsuarios;
    
    public FacadeUsuarios() {
        this.delegateUsuarios = new DelegateUsuarios();
    }
    
    public void guardarUsuarios(Usuarios usuarios){
        delegateUsuarios.saveUsuarios(usuarios);
    }
    
    public void updateUsuarios(Usuarios usuarios) {
        delegateUsuarios.updateUsuarios(usuarios);
    }

    public void deleteUsuarios(Usuarios usuarios) {
        delegateUsuarios.deleteUsuarios(usuarios);
    }

    public List<Usuarios> findAllUsuarios() {
        return delegateUsuarios.findAllUsuarios();
    }

    public Usuarios findUsuariosById(Integer id) {
        return delegateUsuarios.findUsuarioById(id);
    }
}
