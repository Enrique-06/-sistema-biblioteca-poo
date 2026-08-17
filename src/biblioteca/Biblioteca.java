
package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;

public class Biblioteca { //Una unica instancia de esta clase.
    private static Biblioteca instancia; //Singleton
    
    private String nombreBiblioteca = "Biblio UNT";
    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Profesor> listaProfesores;
    private ArrayList<Prestamo> listaPrestamos;
    private ArrayList<Libro> listaLibros;
    
    private Biblioteca() {
        listaEstudiantes = new ArrayList<>();
        listaProfesores = new ArrayList<>();
        listaPrestamos = new ArrayList<>();
        listaLibros = new ArrayList<>();
    }
    
    public static Biblioteca getInstancia(){
        if (instancia == null) {
            instancia = new Biblioteca();
        }
        return instancia;
    }
    
    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public ArrayList<Prestamo> getListaPrestamos() {
        return listaPrestamos;
    }

    public ArrayList<Libro> getListaLibros() {
        return listaLibros;
    }
    
    public void registrarUsuario(Estudiante estudiante){
        listaEstudiantes.add(estudiante);
    }
    
    public void registrarUsuario(Profesor profesor){
        listaProfesores.add(profesor);
    }
    
    public void registrarLibro(Libro libro){
        listaLibros.add(libro);
    }
    
    public void registrarPrestamo(Prestamo prestamo){
        prestamo.getLibro().marcarComoPrestado();
        listaPrestamos.add(prestamo);
    }
    
    public void devolverLibro(Prestamo prestamo){
        prestamo.getLibro().marcarComoDisponible(); //Libro ahora disponible.
        prestamo.registrarDevolucion(LocalDate.now()); //Registra la fecha de devolución del libro.
    }
    
    public String listarLibrosDisponibles(){
        String mensaje = "LIBROS DISPONIBLES";
        String datos = "";
        for(Libro libro:listaLibros){
            if(libro.isEstadoDisponible() == true){
                datos = datos + libro.infoLibro() + "\n";
            }
        }
        return mensaje + "\n" + datos;
    }
    
    public String listarPrestamosActivos(){
        String mensaje = "PRESTAMOS ACTIVOS";
        String datos = "";
        for(Prestamo prestamo: listaPrestamos){
            if(prestamo.esActivo()){
                datos = datos + prestamo.toString() + "\n";
            }
        }
        return mensaje + "\n" + datos;
    }
    
    
    public String listarPrestamosDeUsuario(Estudiante estudiante){
        String datos = "";
        for(Prestamo prestamo: listaPrestamos){
            if(prestamo.getUsuario().equals(estudiante)){
                datos = datos + prestamo.getIdPrestamo() + " " + prestamo.getLibro() + "\n";
            }
        }
        return datos;
    }
    
    public String listarPrestamosDeUsuario(Profesor profesor){
        String datos = "";
        for(Prestamo prestamo: listaPrestamos){
            if(prestamo.getUsuario().equals(profesor)){
                datos = datos + prestamo.getIdPrestamo() + " " + prestamo.getLibro() + "\n";
            }
        }
        return datos;
    }
}
