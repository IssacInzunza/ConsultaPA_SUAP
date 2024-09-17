/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.SUAP.helper;

import java.io.Serializable;
import java.util.List;
import mx.SUAP.entidad.UnidadesDeAprendizaje;
import mx.desarrollo.integracion.ServiceFacadeLocator;

/**
 *
 * @author issac
 */
public class UnidadHelper implements Serializable{
    
    public List<UnidadesDeAprendizaje> getlistUnidades() {
        return ServiceFacadeLocator.getInstanceFacadeUnidadDeAprendizaje().findAllUnidadesDeAprendizaje();
    }
}
