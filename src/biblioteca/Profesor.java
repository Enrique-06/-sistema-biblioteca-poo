
package biblioteca;

import biblioteca.Usuario;

public class Profesor extends Usuario {
    private String idProfesor;

    public Profesor(String idProfesor, String nombreUsuario, String correo, String telefono) {
        super(nombreUsuario, correo, telefono);
        this.idProfesor = idProfesor;
    }

    public String getIdProfesor() {
        return idProfesor;
    }

    @Override
    public String toString() {
        return "Profesor{" + "idProfesor: " + idProfesor + super.infoUsuario() + '}';
    }
    
    
}
