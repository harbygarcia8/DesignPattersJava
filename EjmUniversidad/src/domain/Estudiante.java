package domain;

public class Estudiante {

    private String identificacion;
    private String nombre;
    private int semestreActual;
    private String genero;

    public Estudiante(String identificacion, String nombre) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public Estudiante(String identificacion, String nombre, int semestreActual) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.semestreActual = semestreActual;
    }
}
