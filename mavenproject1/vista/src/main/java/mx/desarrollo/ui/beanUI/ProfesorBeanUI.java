package mx.desarrollo.ui.beanUI;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mx.SUAP.entidad.Profesores;
import mx.SUAP.entidad.UnidadesDeAprendizaje; // Asegúrate de que esta clase exista
import mx.SUAP.helper.ProfesorHelper;

@ManagedBean
@ViewScoped
public class ProfesorBeanUI implements Serializable {
    private final ProfesorHelper helper;
    private List<Profesores> profesores;
    private Profesores profesorSeleccionado; // Atributo para el profesor seleccionado
    private List<UnidadesDeAprendizaje> unidadesAsignadas; // Agrega esta línea

   public ProfesorBeanUI() {
    helper = new ProfesorHelper();
    this.profesores = helper.getlistProfesores();
    this.unidadesAsignadas = new ArrayList<>(); // Inicializa como lista vacía
}

    public List<Profesores> getProfesores() {
        return profesores;
    }

    public void setProfesorSeleccionado(Profesores profesorSeleccionado) {
        this.profesorSeleccionado = profesorSeleccionado;
    }

    public List<UnidadesDeAprendizaje> getUnidadesAsignadas() { // Getter para unidadesAsignadas
        return unidadesAsignadas;
    }

    public void setUnidadesAsignadas(List<UnidadesDeAprendizaje> unidadesAsignadas) { // Setter para unidadesAsignadas
        this.unidadesAsignadas = unidadesAsignadas;
    }

    public void modificarProfesorDesdeFormulario() {
        if (profesorSeleccionado != null) {
            helper.updateProfesor(profesorSeleccionado);
            this.profesores = helper.getlistProfesores();
        }
    }

    public void eliminarProfesor() {
        if (profesorSeleccionado != null) {
            helper.deleteProfesor(profesorSeleccionado);
            this.profesores = helper.getlistProfesores();
        }
    }
}
