package mx.desarrollo.ui;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mx.SUAP.entidad.Profesores;
import mx.SUAP.entidad.UnidadDeAprendizaje;
import mx.SUAP.entidad.Asignacion;
import mx.desarrollo.helper.ProfesorHelper;
import mx.desarrollo.helper.UnidadDeAprendizajeHelper;

@ManagedBean
@ViewScoped
public class ProfesorBeanUI implements Serializable {
    private final ProfesorHelper helper;
    private final UnidadDeAprendizajeHelper unidadHelper;
    private List<Profesores> profesores;
    private Profesores profesorSeleccionado;
    private UnidadDeAprendizaje materiaSeleccionada;
    private List<UnidadDeAprendizaje> materias;

    public ProfesorBeanUI() {
        helper = new ProfesorHelper();
        unidadHelper = new UnidadDeAprendizajeHelper();
        this.profesores = helper.getlistProfesores();
        this.materias = unidadHelper.getAllMaterias();  // Cargar todas las materias
    }

    public List<Profesores> getProfesores() {
        return profesores;
    }

    public void setProfesorSeleccionado(Profesores profesorSeleccionado) {
        this.profesorSeleccionado = profesorSeleccionado;
    }

    public UnidadDeAprendizaje getMateriaSeleccionada() {
        return materiaSeleccionada;
    }

    public void setMateriaSeleccionada(UnidadDeAprendizaje materiaSeleccionada) {
        this.materiaSeleccionada = materiaSeleccionada;
    }

    public List<UnidadDeAprendizaje> getMaterias() {
        return materias;
    }

    public void modificarMateriaProfesor() {
        if (profesorSeleccionado != null && materiaSeleccionada != null) {
            List<Asignacion> asignaciones = helper.getAsignacionesPorProfesor(profesorSeleccionado);
            for (Asignacion asignacion : asignaciones) {
                asignacion.setIdUDA(materiaSeleccionada);
                helper.updateAsignacion(asignacion);
            }
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
