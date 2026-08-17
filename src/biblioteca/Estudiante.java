
package biblioteca;

import biblioteca.Usuario;

public class Estudiante extends Usuario {
    private String idEstudiante;

    public Estudiante(String idEstudiante, String nombreUsuario, String correo, String telefono) {
        super(nombreUsuario, correo, telefono);
        this.idEstudiante = idEstudiante;
    }

    public String getIdEstudiante() {
        return idEstudiante;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "idEstudiante: " + idEstudiante + super.infoUsuario() + '}';
    }
    
    
    
}
