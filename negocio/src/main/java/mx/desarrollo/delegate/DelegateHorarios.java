/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.delegate;
import java.util.List;
import mx.desarrollo.integracion.ServiceLocator;
import mx.SUAP.entidad.Horario;
/**
 *
 * @author Johan
 */
public class DelegateHorarios {
    public void saveHorario(Horario profesores){
        ServiceLocator.getInstanceHorarioDAO().save(profesores);
    }
    
    public void updateHorario(Horario profesor) {
        ServiceLocator.getInstanceHorarioDAO().update(profesor);
    }

    public void deleteHorario(Horario profesor) {
        ServiceLocator.getInstanceHorarioDAO().delete(profesor);
    }

    public List<Horario> findAllHorario() {
        return ServiceLocator.getInstanceHorarioDAO().findAll();
    }

    public Horario findAHorarioById(Integer id) {
        return ServiceLocator.getInstanceHorarioDAO().find(id);
    }
}
