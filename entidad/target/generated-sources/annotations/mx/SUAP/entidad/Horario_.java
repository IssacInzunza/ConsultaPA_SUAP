package mx.SUAP.entidad;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.SUAP.entidad.UnidadesDeAprendizaje;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-16T04:25:46")
@StaticMetamodel(Horario.class)
public class Horario_ { 

    public static volatile SingularAttribute<Horario, Date> horaFin;
    public static volatile SingularAttribute<Horario, Integer> idHorario;
    public static volatile SingularAttribute<Horario, String> tipo;
    public static volatile SingularAttribute<Horario, UnidadesDeAprendizaje> idUnidadAprendizaje;
    public static volatile SingularAttribute<Horario, String> dia;
    public static volatile SingularAttribute<Horario, Date> horaInicio;

}