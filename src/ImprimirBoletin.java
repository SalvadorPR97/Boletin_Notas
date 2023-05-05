import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class ImprimirBoletin {
    // Métodos para imprimir
    public void titulo(){
        System.out.println("\t\t\t EOI - Curso de Programador Java \n\t\t\t Boletín de Calificaciones");
    }
    public void datosAlumno(Alumnos alumno){
        System.out.println("\nAlumno numero: " + alumno);
        System.out.println(alumno.nombreCompleto());
        System.out.println(alumno.getEmail());
        System.out.println("Teléfono: " + alumno.getMovil());
    }
    public void id(){
        System.out.println("\nId. Boletín: " + generarId());
    }
    public void fecha(){
        System.out.println("Fecha: " + generarFecha());
    }
    public void cabecera(){
        System.out.println("\n\nMateria\t\t\t\t\t\t Nota\t\t Calificación");
    }

    public void lineasNotas(String[] lineas){
        for (String linea:lineas){
            System.out.println(linea);
        }
    }

    // Métodos
    public static String generarId(){
        String idBoletin = "";
        String letrasNumeros = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random carac = new Random();
        int max = carac.nextInt(8,11);
        for (int i = 0; i < max; i++) {
            idBoletin += letrasNumeros.charAt(carac.nextInt(letrasNumeros.length()));
        }
        return idBoletin;
    }

    public static String generarFecha(){
        DateFormat formato = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
        String fecha = formato.format(new Date());
        return fecha;
    }

}
