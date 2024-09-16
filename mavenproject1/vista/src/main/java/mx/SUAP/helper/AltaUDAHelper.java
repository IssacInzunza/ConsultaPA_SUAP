/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.SUAP.helper;
import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.io.IOException;
import java.io.Serializable; //aa
import javax.faces.context.FacesContext;

import mx.SUAP.entidad.UnidadesDeAprendizaje;
import mx.desarrollo.integracion.ServiceFacadeLocator;
/**
 *
 * @author Johan
 */
public class AltaUDAHelper {

    public void darDeAltaUDA(UnidadesDeAprendizaje nuevaUDA) throws MySQLIntegrityConstraintViolationException {
        ServiceFacadeLocator.getInstanceFacadeUnidadDeAprendizaje().guardarUnidaddeaprendizaje(nuevaUDA);
    }
    
    public UnidadesDeAprendizaje encontrarUDARepetida (Integer id) {
        return ServiceFacadeLocator.getInstanceFacadeUnidadDeAprendizaje().findUnidadDeAprendizajeById(id);
    }
}
