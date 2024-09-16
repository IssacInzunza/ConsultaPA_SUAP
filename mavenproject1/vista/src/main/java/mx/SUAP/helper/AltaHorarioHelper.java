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

import mx.SUAP.entidad.Horario;
import mx.desarrollo.integracion.ServiceFacadeLocator;
/**
 *
 * @author Johan dddd
 */
public class AltaHorarioHelper implements Serializable{
    public void darDeAltaHorario (Horario nuevoHorario){
        ServiceFacadeLocator.getInstanceFacadeHorarios().guardarHorario(nuevoHorario);
    }
    
    public Horario buscarHorario (Integer horarioID){
        return ServiceFacadeLocator.getInstanceFacadeHorarios().findHorarioById(horarioID);
    }
}
