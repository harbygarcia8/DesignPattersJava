public class PersonaEjemplo {
    String nombre;
    int edad;
    double peso;
    boolean vivo;

    public void PersonaEjemplo() {

    }

    public PersonaEjemplo(String nombre, int edad, double peso) {
        super();
        setNombre(nombre);
        setEdad(edad);
        setPeso(peso);
    }

    public void saludar() {
        System.out.println("Hola " + getNombre());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }
}
