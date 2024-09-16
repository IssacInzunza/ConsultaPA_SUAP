/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.facade;
import java.util.List;
import mx.SUAP.entidad.Horario;
import mx.desarrollo.delegate.DelegateHorarios;
/**
 *
 * @author Johan
 */
public class FacadeHorarios {
    private final DelegateHorarios delegateHorario;
    
    public FacadeHorarios() {
        this.delegateHorario = new DelegateHorarios();
    }
    
    public void guardarHorario(Horario horario){
        delegateHorario.saveHorario(horario);
    }
    
    public void updateHorario(Horario horario) {
        delegateHorario.updateHorario(horario);
    }

    public void deleteHorario(Horario horario) {
        delegateHorario.deleteHorario(horario);
    }

    public List<Horario> findAllHorario() {
        return delegateHorario.findAllHorario();
    }

    public Horario findHorarioById(Integer id) {
        return delegateHorario.findAHorarioById(id);
    }
}
