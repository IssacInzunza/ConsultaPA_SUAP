package mx.SUAP.entidad;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import mx.SUAP.entidad.Administradores;
import mx.SUAP.entidad.Profesores;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-09-16T16:45:37")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, Administradores> administradores;
    public static volatile SingularAttribute<Usuarios, Profesores> profesores;
    public static volatile SingularAttribute<Usuarios, String> nombreDeUsuario;
    public static volatile SingularAttribute<Usuarios, Integer> usuarioId;
    public static volatile SingularAttribute<Usuarios, String> contraseña;

}