package mx.SUAP.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.SUAP.entidad.Asignacion;

<<<<<<< Updated upstream
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-10T15:42:44")
=======
@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-09T22:32:40")
>>>>>>> Stashed changes
@StaticMetamodel(UnidadDeAprendizaje.class)
public class UnidadDeAprendizaje_ { 

    public static volatile SingularAttribute<UnidadDeAprendizaje, Integer> idUnidadAprendizaje;
    public static volatile SingularAttribute<UnidadDeAprendizaje, Integer> horasLaboratorio;
    public static volatile CollectionAttribute<UnidadDeAprendizaje, Asignacion> asignacionCollection;
    public static volatile SingularAttribute<UnidadDeAprendizaje, Integer> horasClase;
    public static volatile SingularAttribute<UnidadDeAprendizaje, String> nombre;
    public static volatile SingularAttribute<UnidadDeAprendizaje, Integer> horasTaller;

}