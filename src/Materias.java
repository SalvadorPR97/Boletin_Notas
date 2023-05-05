public class Materias {
    String[] todasMaterias = {
            "Java Básico - Introducción a Java",
            "Programación Orientada a Objetos",
            "Java Intermedio - Avanzando en Java",
            "Frontend: HTML - CSS - Bootstrap",
            "Java Avanzado - Spring - Microservicios",
            "Soft Skills - Desarrollo de habilidades",
            "Empleo - En busca del puesto adecuado",
            "Presentaciones eficaces"
    };

    public String obtenerCalificacion(double nota){
        String calif = "";
        if (nota < 5)
            calif = "Suspenso";
        else if (nota < 7)
            calif = "Aprobado";
        else if (nota < 9)
            calif = "Notable";
        else if (nota < 10)
            calif = "Sobresaliente";
        else if (nota >= 10)
            calif = "Matrícula";

        return calif;
    }

}
