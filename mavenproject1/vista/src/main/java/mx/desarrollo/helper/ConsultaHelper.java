/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.helper;

import java.io.Serializable;
import java.util.List;
import mx.SUAP.entidad.Profesores;
import mx.desarrollo.integracion.ServiceFacadeLocator;

/**
 *
 * @author jesus
 */
public class ConsultaHelper implements Serializable {

    public List<Profesores> getProfesores() {
        return ServiceFacadeLocator.getInstanceFacadeProfesores().findAllProfesores();
    }
}


