package mx.SUAP.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.SUAP.entidad.Profesores;
import mx.SUAP.entidad.UnidadDeAprendizaje;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-10T15:42:44")
@StaticMetamodel(Asignacion.class)
public class Asignacion_ { 

    public static volatile SingularAttribute<Asignacion, UnidadDeAprendizaje> idUDA;
    public static volatile SingularAttribute<Asignacion, Profesores> idProfesor;
    public static volatile SingularAttribute<Asignacion, Integer> idAsignacion;

}