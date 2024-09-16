/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.SUAP.helper;

import java.io.IOException;
import java.io.Serializable; //aa
import javax.faces.context.FacesContext;
import mx.SUAP.entidad.Profesores;
/*import mx.SUAP.entidad.Alumno;
import mx.SUAP.entidad.Usuario;*/
import mx.desarrollo.integracion.ServiceFacadeLocator;

/**
 *
 * @author Kevin
 */
public class AltasHelper implements Serializable{
    

    /**
     * Metodo para hacer login llamara a la instancia de usuarioFacade
     * @param nuevoProfesor
     * @param idProfesor
     * @param nombre
     * @param apellido
     * @param rfc
     *  
     */
    public void Alta(Profesores nuevoProfesor){
        ServiceFacadeLocator.getInstanceFacadeProfesores().guardarProfesores(nuevoProfesor);
    }
    
    public Profesores buscar(Integer idABuscar){
        return ServiceFacadeLocator.getInstanceFacadeProfesores().findProfesoresById(idABuscar);
    }
    
    
    
}
