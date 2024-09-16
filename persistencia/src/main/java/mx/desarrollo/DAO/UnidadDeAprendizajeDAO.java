/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.DAO;

import mx.SUAP.entidad.UnidadDeAprendizaje;
import mx.desarrollo.persistencia.AbstractDAO;
import java.util.List;

/**
 *
 * @author issac
 */
public class UnidadDeAprendizajeDAO extends AbstractDAO<Integer, UnidadDeAprendizaje>{
    
       public List<UnidadDeAprendizaje> findAll() {
        return super.findAll();
    }
    
}
