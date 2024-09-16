/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.SUAP.ui.beanUI;

/**
 *
 * @author Johan
 */

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import java.io.IOException;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.el.PropertyNotFoundException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.validation.ConstraintViolationException;



import mx.SUAP.helper.AltaHorarioHelper;
import mx.SUAP.entidad.Horario;

import mx.SUAP.entidad.UnidadesDeAprendizaje;

@ManagedBean(name = "altaUDAUI")
@ViewScoped
public class AltasHorarioBeanUI implements Serializable {
    private AltaHorarioHelper horarioHelper;
    Horario horario;
    

    public AltasHorarioBeanUI() {
        horarioHelper = new AltaHorarioHelper();
    }
    
    @PostConstruct
    public void init() {
        horario = new Horario();
    }
    
    public void darDeAltaHorario(){
        Horario horarioRepetido = new Horario();
        
    }
}
