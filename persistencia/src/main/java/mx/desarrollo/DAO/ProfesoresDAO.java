/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.DAO;

import java.util.List;
import mx.SUAP.entidad.Profesores;
import mx.SUAP.entidad.UnidadesDeAprendizaje;
import mx.desarrollo.persistencia.AbstractDAO;
import mx.desarrollo.persistencia.HibernateUtil;
/**
 *
 * @author issac
 */
public class ProfesoresDAO extends AbstractDAO<Integer, Profesores>{
    
    //Falta Correccion Evitar Mover
    public List<UnidadesDeAprendizaje> findUnidadesByProfesor(int idProfesor) {
        String hql = "SELECT a.idUDA FROM Asignacion a WHERE a.idProfesor.idProfesor = :idProfesor";
    return (List<UnidadesDeAprendizaje>) HibernateUtil.getSession()
            .createQuery(hql)
            .setParameter("idProfesor", idProfesor)
            .list();
    }
}
