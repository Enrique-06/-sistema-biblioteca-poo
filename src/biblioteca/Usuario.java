
package biblioteca;

public class Usuario {
    private String nombreUsuario;
    private String correo;
    private String telefono;

    public Usuario(String nombreUsuario, String correo, String telefono) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }
    
    public String infoUsuario() {
        return "NombreUsuario: " + nombreUsuario + ", Correo: " + correo + ", Telefono: " + telefono + '.';
    }
    
    
    
}
