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
import java.util.ArrayList;
import java.util.List;
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
import mx.SUAP.helper.AltaUDAHelper;

@ManagedBean(name = "altaHorarioUI")
@ViewScoped
public class AltasHorarioBeanUI implements Serializable {
    private AltaHorarioHelper horarioHelper;
    private AltaUDAHelper altaudaHelper;
    private Horario horario;
    private UnidadesDeAprendizaje unidadDeAprendizaje;
    private List<String> dias;
    private List<String> tipo;

    private String selectedTipo;
    private String selectedDia;
    
    private String udaRegistradaID;
    private boolean camposDeshabilitados = true; // Variable para controlar el estado de los campos

    public AltasHorarioBeanUI() {
        horarioHelper = new AltaHorarioHelper();
        altaudaHelper = new AltaUDAHelper();
    }
    
    @PostConstruct
    public void init() {
        horario = new Horario();
        tipo = new ArrayList<>();
        tipo.add("clase");
        tipo.add("taller");
        tipo.add("laboratorio");

        dias = new ArrayList<>();
        dias.add("lunes");
        dias.add("martes");
        dias.add("miercoles");
        dias.add("jueves");
        dias.add("viernes");
        dias.add("sabado");
    }

    public void darDeAltaHorario(){
        Integer idIntUDA = Integer.parseInt(udaRegistradaID);
        unidadDeAprendizaje = altaudaHelper.encontrarUDARepetida(idIntUDA);
        if(unidadDeAprendizaje!=null){
            Horario horarioRepetido = new Horario();
            Integer uda_id = unidadDeAprendizaje.getUnidadDeAprendizajeId();
            String uda_nombre =unidadDeAprendizaje.getNombre();
            Integer horas_clase = unidadDeAprendizaje.getHorasClase();
            Integer horas_taller = unidadDeAprendizaje.getHorasTaller();
            Integer horas_laboratorio = unidadDeAprendizaje.getHorasLaboratorio();
            
            
        }else{
            System.out.println("No hay no existe");
        }
        
    }

    // Método que valida si udaRegistradaID está vacío o no
    public void validarCampo1() {
        
        if (udaRegistradaID == null || udaRegistradaID.trim().isEmpty()) {
            camposDeshabilitados = true;  // Deshabilitar campos si está vacío
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Advertencia", "El campo UDA está vacío, por favor complétalo"));
        } else {
            camposDeshabilitados = false;  // Habilitar campos si tiene un valor
        }

        // Forzar la actualización de la interfaz para reflejar los cambios
        FacesContext.getCurrentInstance().getPartialViewContext().getRenderIds().add("form2");
    }


    // Getters y Setters
    public String getUdaRegistradaID() {
        return udaRegistradaID;
    }

    public void setUdaRegistradaID(String udaRegistradaID) {
        this.udaRegistradaID = udaRegistradaID;
    }

    public boolean isCamposDeshabilitados() {
        return camposDeshabilitados;
    }

    public String getSelectedTipo() {
        return selectedTipo;
    }

    public void setSelectedTipo(String selectedTipo) {
        this.selectedTipo = selectedTipo;
    }

    public String getSelectedDia() {
        return selectedDia;
    }

    public void setSelectedDia(String selectedDia) {
        this.selectedDia = selectedDia;
    }

    public List<String> getDias() {
        return dias;
    }

    public List<String> getTipo() {
        return tipo;
    }
}
