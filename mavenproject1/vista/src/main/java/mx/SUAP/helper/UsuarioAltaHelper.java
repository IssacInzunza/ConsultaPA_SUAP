/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.SUAP.helper;

import java.io.Serializable;
import mx.SUAP.entidad.Profesores;
import mx.SUAP.entidad.Usuarios;
import mx.desarrollo.integracion.ServiceFacadeLocator;

/**
 *
 * @author Johan
 */
public class UsuarioAltaHelper implements Serializable{
    
    public void AltaUsuario(Usuarios nuevoUsuario){
        ServiceFacadeLocator.getInstanceFacadeUusuarios().guardarUsuarios(nuevoUsuario);
    }
}
