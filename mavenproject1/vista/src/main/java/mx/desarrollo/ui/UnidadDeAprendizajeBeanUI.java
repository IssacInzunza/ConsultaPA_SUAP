package mx.desarrollo.ui;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mx.SUAP.entidad.UnidadDeAprendizaje;
import mx.desarrollo.helper.UnidadDeAprendizajeHelper;

@ManagedBean
@ViewScoped
public class UnidadDeAprendizajeBeanUI implements Serializable {
    private final UnidadDeAprendizajeHelper helper;
    private List<UnidadDeAprendizaje> materias;  // Lista de materias
    private UnidadDeAprendizaje unidadSeleccionada;

    public UnidadDeAprendizajeBeanUI() {
        helper = new UnidadDeAprendizajeHelper();
        this.materias = helper.getAllMaterias();  // Cargamos todas las materias
    }

    public List<UnidadDeAprendizaje> getMaterias() {
        return materias;
    }

    public void setUnidadSeleccionada(UnidadDeAprendizaje unidadSeleccionada) {
        this.unidadSeleccionada = unidadSeleccionada;
    }
}
