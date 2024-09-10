/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.SUAP.entidad;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Johan
 */
@Entity
@Table(name = "unidad_de_aprendizaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadDeAprendizaje.findAll", query = "SELECT u FROM UnidadDeAprendizaje u")
    , @NamedQuery(name = "UnidadDeAprendizaje.findByIdUnidadAprendizaje", query = "SELECT u FROM UnidadDeAprendizaje u WHERE u.idUnidadAprendizaje = :idUnidadAprendizaje")
    , @NamedQuery(name = "UnidadDeAprendizaje.findByNombre", query = "SELECT u FROM UnidadDeAprendizaje u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "UnidadDeAprendizaje.findByHorasClase", query = "SELECT u FROM UnidadDeAprendizaje u WHERE u.horasClase = :horasClase")
    , @NamedQuery(name = "UnidadDeAprendizaje.findByHorasTaller", query = "SELECT u FROM UnidadDeAprendizaje u WHERE u.horasTaller = :horasTaller")
    , @NamedQuery(name = "UnidadDeAprendizaje.findByHorasLaboratorio", query = "SELECT u FROM UnidadDeAprendizaje u WHERE u.horasLaboratorio = :horasLaboratorio")})
public class UnidadDeAprendizaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idUnidadAprendizaje")
    private Integer idUnidadAprendizaje;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "horas_clase")
    private Integer horasClase;
    @Column(name = "horas_taller")
    private Integer horasTaller;
    @Column(name = "horas_laboratorio")
    private Integer horasLaboratorio;
    @OneToMany(mappedBy = "idUDA")
    private Collection<Asignacion> asignacionCollection;

    public UnidadDeAprendizaje() {
    }

    public UnidadDeAprendizaje(Integer idUnidadAprendizaje) {
        this.idUnidadAprendizaje = idUnidadAprendizaje;
    }

    public Integer getIdUnidadAprendizaje() {
        return idUnidadAprendizaje;
    }

    public void setIdUnidadAprendizaje(Integer idUnidadAprendizaje) {
        this.idUnidadAprendizaje = idUnidadAprendizaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(Integer horasClase) {
        this.horasClase = horasClase;
    }

    public Integer getHorasTaller() {
        return horasTaller;
    }

    public void setHorasTaller(Integer horasTaller) {
        this.horasTaller = horasTaller;
    }

    public Integer getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(Integer horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    @XmlTransient
    public Collection<Asignacion> getAsignacionCollection() {
        return asignacionCollection;
    }

    public void setAsignacionCollection(Collection<Asignacion> asignacionCollection) {
        this.asignacionCollection = asignacionCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUnidadAprendizaje != null ? idUnidadAprendizaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadDeAprendizaje)) {
            return false;
        }
        UnidadDeAprendizaje other = (UnidadDeAprendizaje) object;
        if ((this.idUnidadAprendizaje == null && other.idUnidadAprendizaje != null) || (this.idUnidadAprendizaje != null && !this.idUnidadAprendizaje.equals(other.idUnidadAprendizaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.SUAP.entidad.UnidadDeAprendizaje[ idUnidadAprendizaje=" + idUnidadAprendizaje + " ]";
    }
    
}
