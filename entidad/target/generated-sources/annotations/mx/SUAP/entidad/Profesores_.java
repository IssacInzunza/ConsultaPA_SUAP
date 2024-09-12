package mx.SUAP.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.SUAP.entidad.Asignacion;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-11T15:40:58")
@StaticMetamodel(Profesores.class)
public class Profesores_ { 

    public static volatile SingularAttribute<Profesores, Integer> idProfesor;
    public static volatile CollectionAttribute<Profesores, Asignacion> asignacionCollection;
    public static volatile SingularAttribute<Profesores, String> apellido;
    public static volatile SingularAttribute<Profesores, String> nombre;
    public static volatile SingularAttribute<Profesores, String> rfc;

}