package mx.desarrollo.ui;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import mx.SUAP.entidad.Asignacion;
import mx.desarrollo.helper.AsignacionHelper;

@ManagedBean
@ViewScoped
public class AsignacionBeanUI implements Serializable {
    private final AsignacionHelper helper;
    private List<Asignacion> asignaciones;
    private Asignacion asignacionSeleccionada;

    public AsignacionBeanUI() {
        helper = new AsignacionHelper();
        this.asignaciones = helper.getlistAsignaciones();
    }

    public List<Asignacion> getAsignaciones() {
        return asignaciones;
    }

    public void setAsignacionSeleccionada(Asignacion asignacionSeleccionada) {
        this.asignacionSeleccionada = asignacionSeleccionada;
    }

    public void modificarAsignacion() {
        if (asignacionSeleccionada != null) {
            helper.updateAsignacion(asignacionSeleccionada);
            this.asignaciones = helper.getlistAsignaciones();
        }
    }

    public void eliminarAsignacion() {
        if (asignacionSeleccionada != null) {
            helper.deleteAsignacion(asignacionSeleccionada);
            this.asignaciones = helper.getlistAsignaciones();
        }
    }
}
