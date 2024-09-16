/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.desarrollo.DAO;
import mx.SUAP.entidad.Profesores;
import mx.SUAP.entidad.Usuarios;
import mx.desarrollo.persistencia.AbstractDAO;
import mx.desarrollo.persistencia.HibernateUtil;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
/**
 *
 * @author Johan
 */
public class UsuariosDAO extends AbstractDAO<Integer, Usuarios>{
    public void registrarProfesor(Profesores nuevoProfesor, Usuarios nuevoUsuario) {
    Session session = HibernateUtil.getSession();
    Transaction tx = null;
    try {
        tx = session.beginTransaction();

        // Insertar en la tabla usuarios
        String sqlUsuario = "INSERT INTO usuarios (usuario_id, contraseña, nombre_de_usuario) VALUES (:usuario_id, :contraseña, :nombre_de_usuario)";
        SQLQuery queryUsuario = session.createSQLQuery(sqlUsuario);
        queryUsuario.setParameter("usuario_id", nuevoUsuario.getUsuarioId());
        queryUsuario.setParameter("contraseña", nuevoUsuario.getContraseña());
        queryUsuario.setParameter("nombre_de_usuario", nuevoUsuario.getNombreDeUsuario());
        queryUsuario.executeUpdate();

        // Insertar en la tabla profesores
        String sqlProfesor = "INSERT INTO profesores (id_profesor, nombre, apellido, rfc) VALUES (:id_profesor, :nombre, :apellido, :rfc)";
        SQLQuery queryProfesor = session.createSQLQuery(sqlProfesor);
        queryProfesor.setParameter("id_profesor", nuevoProfesor.getIdProfesor());
        queryProfesor.setParameter("nombre", nuevoProfesor.getNombre());
        queryProfesor.setParameter("apellido", nuevoProfesor.getApellido());
        queryProfesor.setParameter("rfc", nuevoProfesor.getRfc());
        queryProfesor.executeUpdate();

        // Commit de la transacción
        tx.commit();
    } catch (Exception e) {
        if (tx != null) tx.rollback();
        e.printStackTrace();
        throw new RuntimeException(e);
    } finally {
        session.close();
    }
}

}
