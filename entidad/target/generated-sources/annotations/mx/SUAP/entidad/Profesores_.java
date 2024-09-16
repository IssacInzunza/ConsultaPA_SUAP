package mx.SUAP.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.SUAP.entidad.UnidadesDeAprendizaje;
import mx.SUAP.entidad.Usuarios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-15T15:29:07")
@StaticMetamodel(Profesores.class)
public class Profesores_ { 

    public static volatile SingularAttribute<Profesores, Integer> idProfesor;
    public static volatile SingularAttribute<Profesores, String> apellido;
    public static volatile ListAttribute<Profesores, UnidadesDeAprendizaje> unidadesDeAprendizajeList;
    public static volatile SingularAttribute<Profesores, Usuarios> usuarios;
    public static volatile SingularAttribute<Profesores, String> nombre;
    public static volatile SingularAttribute<Profesores, String> rfc;

}