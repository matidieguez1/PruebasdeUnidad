package Modelo;

import java.util.Observable;

/**
 * <b>inv: </b><br>
 * nombreApe!=null <br>
 * !nombreApe.equals("") <br>
 * email!=null <br>
 * !email.equals("") <br>
 * telefono!=null <br>
 * !telefono.equals("") <br>
 * perfil!=null <br>
 * !perfil.equals("") <br>
 * nombreUsuario!=null <br>
 * !nombreUsuario.equals("") <br>
 * contrase�a!=null <br>
 * !contrase�a.equals("") <br>
 * base!=null <br>
 */
public class Usuario extends Observable
{
    private String nombreApe;
    private String email;
    private String telefono;
    private String perfil;
    private String nombreUsuario;
    private String contrase�a;
    BaseDeDatos base=null;
    
    public Usuario()
    {
        super();
    }
    /**
     * Constructor de la clase Usuario
     * @param nombreApe Nombre y apellido del Colaborador o Administrador.
     * @param email Cuenta de email del Colaborador o Administrador.
     * @param telefono Telefono del Colaborador o Administrador.
     * @param perfil Inica si el usuario es un administrador o un colaborador.
     * @param nombreUsuario Nombre de usuario del Colaborador o Administrador que ser� utilizado para loggearse.
     * @param contrase�a Contrase�a del Colaborador o Administrador que ser� utilizado para loggearse.
     * @param base Referencia a la base de datos.
     * <b>pre:</b>Todos los parametros deben ser distintos de null y distintos de vacio.<br>
     * <b>post:</b> Se crea un usuario.<br>
     */
    public Usuario(String nombreApe, String email, String telefono, String perfil, String nombreUsuario, String contrase�a, BaseDeDatos base)
    {
        this.nombreApe = nombreApe;
        this.email = email;
        this.telefono = telefono;
        this.perfil = perfil;
        this.nombreUsuario = nombreUsuario;
        this.contrase�a = contrase�a;
        this.base=base;
        this.verificaInvariante();
    }
    
    /**
     * @param nomApe
     * <b>pre:</b> nomApe!=null && !nomApe.equals("")
     */
    public void setNombreApe(String nomApe)
    {
        this.nombreApe = nomApe;
        this.verificaInvariante();
    }

    public String getNombreApe()
    {
        return nombreApe;
    }
    
    /**
     * @param email
     * <b>pre:</b> email!=null && !email.equals("")
     */
    public void setEmail(String email)
    {
        this.email = email;
        this.verificaInvariante();
    }

    public String getEmail()
    {
        return email;
    }
    
    /**
     * @param telefono
     * <b>pre:</b> telefono!=null && !telefono.equals("")
     */
    public void setTelefono(String telefono)
    {
        this.telefono = telefono;
        this.verificaInvariante();
    }

    public String getTelefono()
    {
        return telefono;
    }
    
    /**
     * @param perfil
     * <b>pre:</b> perfil!=null && !perfil.equals("")
     */
    public void setPerfil(String perfil)
    {
        this.perfil = perfil;
        this.verificaInvariante();
    }

    public String getPerfil()
    {
        return perfil;
    }
    
    /**
     * @param nombreUsuario
     * <b>pre:</b> nombreUsuario!=null && !nombreUsuario("")
     */
    public void setNombreUsuario(String nombreUsuario)
    {
        this.nombreUsuario = nombreUsuario;
        this.verificaInvariante();
    }

    public String getNombreUsuario()
    {
        return nombreUsuario;
    }
    
    /**
     * @param contrase�a
     * <b>pre:</b> contrase�a!=null && !contrase�a.equals("")
     */
    public void setContrase�a(String contrase�a)
    {
        this.contrase�a = contrase�a;
        this.verificaInvariante();
    }

    public String getContrase�a()
    {
        return contrase�a;
    }
    
    /**
     * @param base
     * <b>pre:</b> base!=null
     */
    public void setBase(BaseDeDatos base)
    {
        this.base = base;
        this.verificaInvariante();
    }

    public BaseDeDatos getBase()
    {
        return base;
    }
    
    private void verificaInvariante()
    {
        assert nombreApe!=null: "Nombre y Apellido nulo";
        assert !nombreApe.equals(""): "Nombre y apellido vacio";
        assert email!=null: "Email nulo";
        assert !email.equals(""): "email vacio";
        assert telefono!=null: "Telefono nulo";
        assert !telefono.equals(""): "telefono vacio";
        assert perfil!=null: "Perfil nulo";
        assert !perfil.equals(""): "perfil vacio";
        assert nombreUsuario!=null: "nomreUsuario nulo";
        assert nombreUsuario.equals(""): "nombreUsuario vacio";
        assert contrase�a!=null: "Contrtase�a nula";
        assert !contrase�a.equals(""): "contrase�a vacia";
        assert base!=null: "Referencia nula a base de datos";
    }
}
