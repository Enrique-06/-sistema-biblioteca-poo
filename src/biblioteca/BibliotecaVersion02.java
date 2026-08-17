//
//package biblioteca;
//
//import java.time.LocalDate;
//import javax.swing.text.MaskFormatter;
//
//public class BibliotecaVersion02 {
//
//    public static void main(String[] args) {
//        // TODO code application logic here
//        Libro libro1 = new Libro(100, "Analisis", "Ledezma", LocalDate.now(), "Ingenieria");
//        Libro libro2 = new Libro(200, "Geometria", "Avalos", LocalDate.now(), "Matematica");
//        //Libros Disponibles
//        Libro libro3 = new Libro(300, "IA", "Gutierrez", LocalDate.now(), "Tecnologia");
//        Libro libro4 = new Libro(400, "Lenguajes", "", LocalDate.now(), "Automatas");
//        
//        Estudiante e1 = new Estudiante(0, "Enrique", "ismael@gmail.com", 987654321);
//        Estudiante e2 = new Estudiante(1, "Ryan", "ryan@gmail.com", 975312468);
//        Profesor p1 = new Profesor(10, "Peralta", "peralta@gmail.com", 1234);
//        Profesor p2 = new Profesor(20, "Melquiades", "melqui@gmail.com", 5678);
//        
//        //Registrar prestamos.
//        Prestamo pr1 = new Prestamo(libro1, e1, LocalDate.now());
//        Prestamo pr2 = new Prestamo(libro2, p1, LocalDate.now());
//        //Los libros deben no estar disponibles.
//        pr1.getLibro().marcarComoPrestado();
//        pr2.getLibro().marcarComoPrestado();
//        
//        
//        Biblioteca miBiblio = new Biblioteca();
//        //Libro
//        miBiblio.registrarLibro(libro1);
//        miBiblio.registrarLibro(libro2);
//        miBiblio.registrarLibro(libro3);
//        miBiblio.registrarLibro(libro4);
//        //Mostrar libros Disponibles
//        System.out.println(miBiblio.listarLibrosDisponibles());
//        
//        //Estudiante
//        miBiblio.registrarUsuario(e1);
//        miBiblio.registrarUsuario(e2);
//        //Profesor
//        miBiblio.registrarUsuario(p1);
//        miBiblio.registrarUsuario(p2);
//        
//        
//        //Prestamo
//        miBiblio.registrarPrestamo(pr1);
//        miBiblio.registrarPrestamo(pr2);
//        
//        //Cancelar prestamos.
//        //pr1.registrarDevolucion(LocalDate.now());
//        //pr2.registrarDevolucion(LocalDate.now());
//        //Mostrar Prestamos Activos
//        //System.out.println(miBiblio.listarPrestamosActivos()); //No muestra nada.
//        
//        //Devolver Libro o Cancelar Prestamos
//        System.out.println("Id Libro: 100");
//        System.out.println("Ingrese correo: ismael@gmail.com");
//        for(Prestamo p : miBiblio.getListaPrestamos()){
//            if(p.getUsuario().getCorreo().equals("ismael@gmail.com")){
//                miBiblio.devolverLibro(p);
//                System.out.println("Prestamo devuelto.");
//            }
//        }
//        System.out.println(miBiblio.listarPrestamosActivos());
//        
//        
//        String info = """
//                      Menu:
//                      1. Registrar Usuario.
//                      2. Registrar Libro.
//                      3. Registrar Prestamo.
//                      4. Devolver Libro.
//                      5. Libros disponibles.
//                      6. Prestamos activos.
//                      7. Listar Prestamos de un Usuario.
//                      """;
//        //System.out.println(info);
//        
//        
//    }
//    
//}
