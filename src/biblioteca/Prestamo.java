
package biblioteca;

import biblioteca.Usuario;
import biblioteca.Libro;
import java.time.LocalDate;

public class Prestamo { //Clase Asociación entre Usuario Y Libro.
    private static int contador;
    private int idPrestamo;
    private Libro libro;
    private Usuario usuario;
    private LocalDate fechaPrestamo;
    private LocalDate fechaDevolucion;

    public Prestamo(Libro libro, Usuario usuario, LocalDate fechaPrestamo) {
        this.idPrestamo = ++contador;
        this.libro = libro;
        this.usuario = usuario;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = null;
    }
    
    public static int getContador() {
        return contador;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public Libro getLibro() {
        return libro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public LocalDate getFechaDevolucion() {
        return fechaDevolucion;
    }
    
    public boolean esActivo(){
        return fechaDevolucion == null; //Si no se entrega esta activo.
    }
    
    public void registrarDevolucion(LocalDate fecha){
        this.fechaDevolucion = fecha;
    }
    
    //No hay metodo que modifique la fechaDevolucion a null ya que no se reutilizan objetos prestamo.
    
    @Override
    public String toString() {
        return "Prestamo{" + "IdPrestamo=" + idPrestamo + ", Libro=" + libro.getNombreLibro() + ", Usuario=" + usuario.getNombreUsuario() + " ,Correo: " + usuario.getCorreo() + ", FechaPrestamo=" + fechaPrestamo + ", FechaDevolucion=" + fechaDevolucion + '}';
    }
    
    
}
