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

import mx.SUAP.helper.AltaUDAHelper;
import mx.SUAP.helper.AltasHelper;

import mx.SUAP.entidad.UnidadesDeAprendizaje;

@ManagedBean(name = "altaUDAUI")
@ViewScoped
public class AltasUDABeanUI implements Serializable {

    private AltaUDAHelper altaUDAHelper;
    private UnidadesDeAprendizaje uda;
    

    public AltasUDABeanUI() {
        altaUDAHelper = new AltaUDAHelper();

        

    }

    @PostConstruct
    public void init() {
        uda = new UnidadesDeAprendizaje();
    }

    public void darDeAltaUDA() throws IOException {
        UnidadesDeAprendizaje uda_repetida = null;
        
        Integer id_uda = uda.getUnidadDeAprendizajeId();
        String uda_nombre = ValidacionesCadenas.limpiarEspacios(uda.getNombre());
        Integer horas_clase = uda.getHorasClase();
        Integer horas_taller = uda.getHorasTaller();
        Integer horas_laboratorio = uda.getHorasLaboratorio();
        
        uda_repetida = altaUDAHelper.encontrarUDARepetida(id_uda);
        
        
         if (id_uda == null || uda_nombre == null || horas_clase == null || horas_taller == null || horas_laboratorio == null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error al capturar los datos:", "Por favor evite dejar campos vacíos"));

        }/*else if (selectedTipo == null || selectedTipo.isEmpty() || selectedDia == null || selectedDia.isEmpty()){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error al capturar los datos:", "Por favor evite dejar campos vacíos"));
            
        }*/ else if (!ValidacionesCadenas.esCadenaSoloLetras(uda_nombre) || ValidacionesCadenas.isBlank(uda_nombre)) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Error al capturar los datos:", "Nombre no válido"));

        }else if(uda_repetida!=null){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                        "Error", "La unidad de aprendizaje ya existe"));
        } else {
            try {
                altaUDAHelper.darDeAltaUDA(uda); // Asegúrate de que tu helper tiene este método
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                        "Éxito", "Unidad de aprendizaje guardada exitosamente"));
                uda = new UnidadesDeAprendizaje(); // Limpiar el formulario
            } catch (MySQLIntegrityConstraintViolationException e) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                        "Error", "La unidad de aprendizaje ya existe"));
            } catch (Exception e) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,
                        "Error", "Se ha producido un error inesperado"));
            }
        }
    }
    
    public void altaHorario(){
        
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

   

}
