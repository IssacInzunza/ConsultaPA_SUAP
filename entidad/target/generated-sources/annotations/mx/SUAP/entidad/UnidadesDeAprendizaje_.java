package mx.SUAP.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.SUAP.entidad.Horario;
import mx.SUAP.entidad.Profesores;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-16T16:45:37")
@StaticMetamodel(UnidadesDeAprendizaje.class)
public class UnidadesDeAprendizaje_ { 

    public static volatile SingularAttribute<UnidadesDeAprendizaje, Integer> horasLaboratorio;
    public static volatile SingularAttribute<UnidadesDeAprendizaje, Integer> unidadDeAprendizajeId;
    public static volatile SingularAttribute<UnidadesDeAprendizaje, Integer> horasClase;
    public static volatile SingularAttribute<UnidadesDeAprendizaje, String> nombre;
    public static volatile SingularAttribute<UnidadesDeAprendizaje, Integer> horasTaller;
    public static volatile ListAttribute<UnidadesDeAprendizaje, Profesores> profesoresList;
    public static volatile ListAttribute<UnidadesDeAprendizaje, Horario> horarioList;

}