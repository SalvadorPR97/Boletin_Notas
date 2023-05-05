import java.util.Scanner;

public class Boletin {
    public static void main(String[] args) {
        // Pedimos el identificador del alumno y creamos el objeto alumno
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n\nIntroduzca el identificador del alumno: ");
        Alumnos alumno = Alumnos.valueOf(entrada.nextLine());

        // Recibimos las materias de la clase Materias y pedimos que se introduzcan las notas en orden
        Materias materias = new Materias();
        String[] lineas = new String[materias.todasMaterias.length];
        double notas = 0;
        System.out.println("Introduzca las notas de " + alumno.nombreCompleto() + " para:");
        for (int i = 0; i < materias.todasMaterias.length; i++) {
            System.out.print(materias.todasMaterias[i] + ": ");
            double nota = Double.parseDouble(entrada.nextLine());
            String calif = materias.obtenerCalificacion(nota);

            lineas[i] = materias.todasMaterias[i] + "\t\t" + nota + "\t\t" + calif;
            notas += nota;
        }
        double notaMedia = notas/materias.todasMaterias.length;

        // Pedimos que te introduzcan las observaciones, con una variable de control para los párrafos
        System.out.println("\nIntroduzca observaciones y recomendaciones:");
        String observaciones = entrada.nextLine();
        int quiereParrafo = 1;
        int numParrafo = 2;
        while (quiereParrafo != 0) {
            System.out.println("Quiere añadir otro párrafo?(1 = Si, 0 = No)");
            quiereParrafo = Integer.parseInt(entrada.nextLine());
            if (quiereParrafo == 1) {
                System.out.println("Introduzca párrafo " + numParrafo);
                observaciones += "\n" + entrada.nextLine();
                numParrafo++;
            }
        }

        // Imprimimos el boletín por pantalla con todos los datos
        ImprimirBoletin imprimir = new ImprimirBoletin();
        imprimir.titulo();

        imprimir.datosAlumno(alumno);
        imprimir.id();
        imprimir.fecha();

        imprimir.cabecera();
        imprimir.lineasNotas(lineas);

        System.out.println("\t\t\t\t\t Calificación final\t\t " + notaMedia + "\t\t " + materias.obtenerCalificacion(notaMedia));

        System.out.println("\nObservaciones y recomendaciones:");
        System.out.println(observaciones);
    }


}
