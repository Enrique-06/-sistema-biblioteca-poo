
package biblioteca;

import java.time.LocalDate;

public class Libro {
    private String idLibro;
    private String nombreLibro;
    private String autor;
    private String fechaPublicacion;
    private String genero;
    private boolean estadoDisponible;

    public Libro(String idLibro, String nombreLibro, String autor, String fechaPublicacion, String genero) {
        this.idLibro = idLibro;
        this.nombreLibro = nombreLibro;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.genero = genero;
        this.estadoDisponible = true;
    }
    
    public String getIdLibro() {
        return idLibro;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isEstadoDisponible() {
        return estadoDisponible;
    }
    
    public void marcarComoDisponible(){
        this.estadoDisponible = true;
    }
    
    public void marcarComoPrestado(){
        this.estadoDisponible = false;
    }
    
    public String infoLibro(){
        return "Libro{" + "idLibro=" + idLibro +
                ", nombreLibro=" + nombreLibro +
                ", autor=" + autor + ", fechaPublicacion=" +
                fechaPublicacion + ", genero=" + genero + '}';
    }

   
    
    
}
