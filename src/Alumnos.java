public enum Alumnos {
    A1001("David","Alfonso","Martin","609251201","david@java.eoi.es"),
    A1002("Hugo José","Alonso","García","609251202","hugojose@java.eoi.es"),
    A1003("Daniel","Bilbao","Fornell","609251203","daniel@java.eoi.es"),
    A1004("Manuel","Bonilla","Alvarado","609251204","manuel@java.eoi.es"),
    A1005("Sandra","Checa","Ruiz","609251205","sandra@java.eoi.es"),
    A1006("Melchor","Díaz","Reyes","609251206","melchor@java.eoi.es"),
    A1007("Antonio","García","Ramírez","609251207","antonio@java.eoi.es"),
    A1008("Alejandro","Gómez","Gómez","609251208","alejandro@java.eoi.es"),
    A1009("Santiago","Gómez","Penagos","609251209","santiago@java.eoi.es"),
    A1010("Lorena","Jiménez","Morán","609251210","lorena@java.eoi.es"),
    A1011("Pablo","Laz","Ruiz","609251211","pablo@java.eoi.es"),
    A1012("Marta","Lima","Rojas","609251212","marta@java.eoi.es"),
    A1013("Iván","Mañas","Gutiérrez","609251213","ivan@java.eoi.es"),
    A1014("Adrián","Martel","Cortijo","609251214","adrian@java.eoi.es"),
    A1015("Alexander","Martinez","Moron","609251215","alexander@java.eoi.es"),
    A1016("Laura","Molero","Molina","609251216","laura@java.eoi.es"),
    A1017("Diego","Ortega","De","609251217","diego@java.eoi.es"),
    A1018("Salvador","Pérez","Ranchal","609251218","salvador@java.eoi.es"),
    A1019("David","Pinto","Pajares","609251219","david@java.eoi.es"),
    A1020("Juan José","Romero","Palacios","609251220","juanjose@java.eoi.es"),
    A1021("Alejandro","Saponi","Carmona","609251221","alejandro@java.eoi.es"),
    A1022("Santiago","Tasset","González","609251222","santiago@java.eoi.es"),
    A1023("Alba","Valverde","Marcos","609251223","alba@java.eoi.es");

    private final String nombre;
    private final String apellido1;
    private final String apellido2;
    private final String movil;
    private final String email;


    public String nombreCompleto(){
        return nombre + " " + apellido1 + " " + apellido2;
    }
    Alumnos(String nombre, String apellido1, String apellido2, String movil, String email) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.movil = movil;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getMovil() {
        return movil;
    }

    public String getEmail() {
        return email;
    }



}
