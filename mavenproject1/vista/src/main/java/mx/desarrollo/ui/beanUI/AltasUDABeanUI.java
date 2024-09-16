/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.ui.beanUI;

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

import mx.SUAP.helper.AltaUDAHelper;
import mx.SUAP.helper.AltasHelper;

import mx.SUAP.entidad.UnidadesDeAprendizaje;

@ManagedBean(name = "altaUDAUI")
@ViewScoped
public class AltasUDABeanUI implements Serializable{
    private AltaUDAHelper altaUDAHelper;
    private UnidadesDeAprendizaje uda;
    private List<String> dias;
    private List<String> tipo;
    
    private String selectedTipo;
    private String selectedDia;
    
    public AltasUDABeanUI (){
        altaUDAHelper = new AltaUDAHelper();
        
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
    
    @PostConstruct
    public void init(){
        uda = new UnidadesDeAprendizaje();
    }
    
    public void darDeAltaUDA() throws IOException {
        UnidadesDeAprendizaje uda_repetida = null;
        
        Integer id_uda = uda.getUnidadDeAprendizajeId();
        String uda_nombre = ValidacionesCadenas.limpiarEspacios(uda.getNombre());
        Integer horas_clase = uda.getHorasClase();
        Integer horas_taller = uda.getHorasTaller();
        Integer horas_laboratorio = uda.getHorasLaboratorio();
        
        if(id_uda == null || uda_nombre == null || horas_clase  == null || horas_taller  == null ||horas_laboratorio == null){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error al capturar los datos:", "Por favor evite dejar campos vacíos"));
            
        }/*else if (selectedTipo == null || selectedTipo.isEmpty() || selectedDia == null || selectedDia.isEmpty()){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error al capturar los datos:", "Por favor evite dejar campos vacíos"));
            
        }*/else if(!ValidacionesCadenas.esCadenaSoloLetras(uda_nombre) || ValidacionesCadenas.isBlank(uda_nombre)){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error al capturar los datos:", "Nombre no válido"));
            
        }else{
            altaUDAHelper.darDeAltaUDA(uda);
        }
    }

    public AltaUDAHelper getAltaUDAHelper() {
        return altaUDAHelper;
    }

    public void setAltaUDAHelper(AltaUDAHelper altaUDAHelper) {
        this.altaUDAHelper = altaUDAHelper;
    }

    public UnidadesDeAprendizaje getUda() {
        return uda;
    }

    public void setUda(UnidadesDeAprendizaje uda) {
        this.uda = uda;
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
