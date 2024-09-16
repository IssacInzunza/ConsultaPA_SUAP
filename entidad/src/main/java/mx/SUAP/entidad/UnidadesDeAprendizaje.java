/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.SUAP.entidad;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
@Table(name = "unidades_de_aprendizaje")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadesDeAprendizaje.findAll", query = "SELECT u FROM UnidadesDeAprendizaje u")
    , @NamedQuery(name = "UnidadesDeAprendizaje.findByUnidadDeAprendizajeId", query = "SELECT u FROM UnidadesDeAprendizaje u WHERE u.unidadDeAprendizajeId = :unidadDeAprendizajeId")
    , @NamedQuery(name = "UnidadesDeAprendizaje.findByNombre", query = "SELECT u FROM UnidadesDeAprendizaje u WHERE u.nombre = :nombre")
    , @NamedQuery(name = "UnidadesDeAprendizaje.findByHorasClase", query = "SELECT u FROM UnidadesDeAprendizaje u WHERE u.horasClase = :horasClase")
    , @NamedQuery(name = "UnidadesDeAprendizaje.findByHorasTaller", query = "SELECT u FROM UnidadesDeAprendizaje u WHERE u.horasTaller = :horasTaller")
    , @NamedQuery(name = "UnidadesDeAprendizaje.findByHorasLaboratorio", query = "SELECT u FROM UnidadesDeAprendizaje u WHERE u.horasLaboratorio = :horasLaboratorio")})
public class UnidadesDeAprendizaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "unidad_de_aprendizaje_id")
    private Integer unidadDeAprendizajeId;
    @Basic(optional = false)
    @Column(name = "nombre")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "horas_clase")
    private int horasClase;
    @Basic(optional = false)
    @Column(name = "horas_taller")
    private int horasTaller;
    @Basic(optional = false)
    @Column(name = "horas_laboratorio")
    private int horasLaboratorio;
    @ManyToMany(mappedBy = "unidadesDeAprendizajeList")
    private List<Profesores> profesoresList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idUnidadAprendizaje")
    private List<Horario> horarioList;

    public UnidadesDeAprendizaje() {
    }

    public UnidadesDeAprendizaje(Integer unidadDeAprendizajeId) {
        this.unidadDeAprendizajeId = unidadDeAprendizajeId;
    }

    public UnidadesDeAprendizaje(Integer unidadDeAprendizajeId, String nombre, int horasClase, int horasTaller, int horasLaboratorio) {
        this.unidadDeAprendizajeId = unidadDeAprendizajeId;
        this.nombre = nombre;
        this.horasClase = horasClase;
        this.horasTaller = horasTaller;
        this.horasLaboratorio = horasLaboratorio;
    }

    public Integer getUnidadDeAprendizajeId() {
        return unidadDeAprendizajeId;
    }

    public void setUnidadDeAprendizajeId(Integer unidadDeAprendizajeId) {
        this.unidadDeAprendizajeId = unidadDeAprendizajeId;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasClase() {
        return horasClase;
    }

    public void setHorasClase(int horasClase) {
        this.horasClase = horasClase;
    }

    public int getHorasTaller() {
        return horasTaller;
    }

    public void setHorasTaller(int horasTaller) {
        this.horasTaller = horasTaller;
    }

    public int getHorasLaboratorio() {
        return horasLaboratorio;
    }

    public void setHorasLaboratorio(int horasLaboratorio) {
        this.horasLaboratorio = horasLaboratorio;
    }

    @XmlTransient
    public List<Profesores> getProfesoresList() {
        return profesoresList;
    }

    public void setProfesoresList(List<Profesores> profesoresList) {
        this.profesoresList = profesoresList;
    }

    @XmlTransient
    public List<Horario> getHorarioList() {
        return horarioList;
    }

    public void setHorarioList(List<Horario> horarioList) {
        this.horarioList = horarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (unidadDeAprendizajeId != null ? unidadDeAprendizajeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadesDeAprendizaje)) {
            return false;
        }
        UnidadesDeAprendizaje other = (UnidadesDeAprendizaje) object;
        if ((this.unidadDeAprendizajeId == null && other.unidadDeAprendizajeId != null) || (this.unidadDeAprendizajeId != null && !this.unidadDeAprendizajeId.equals(other.unidadDeAprendizajeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mx.SUAP.entidad.UnidadesDeAprendizaje[ unidadDeAprendizajeId=" + unidadDeAprendizajeId + " ]";
    }
    
}
