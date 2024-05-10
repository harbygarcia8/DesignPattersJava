public class Modificadores {
    //Modificadores de acceso para métodos y atributos

    //Public:
    // Se refiere a que clases de otros paquetes pueden acceder a este atributo
    // o método y subclases
    public int variable;


    //Sin modificador:
    // Por defecto sólo podrá acceder a este atributo o método desde el mismo paquete.
    boolean esVerdad;

    //Protected:
    //Significa que pueden acceder clases del mismo paquete
    protected double peso;

    //Private:
    //Significa que solo podrán acceder a este
    // atributo o método la misma clase en donde está declarada.
    private int edad;

    //Modificador de mutabilidad solo para atributos
    //Estos son solo comunes para los atributos encontramos el más común.
    // final: significa que es una variable inmutable
    // transient: Es el menos común pero se utiliza para la serialización
    // y es cuando queremos enviar una clase o un atributo a traves de conexión
    // por puertos.
    // volatil: Lo usamos cuando queremos sincronizar distintos hilos
    // de ejecución en java y significa que esta variable va a ser accedida por
    // distintos hilos de ejecución simultaneamente.

    final String CC = "1034565646";
    transient char inicial; // Significa que esta variable no puede ser serializada
    volatile int variableVolatil;

    // Modificadores para métodos

    // Solo permite una ejecución por hilo simultaneamente, es decir,
    // solo puede haber una instancia de este método corriendo al mismo tiempo
    synchronized void metodoSincronizado(int n) {
        for (int i = 1; i < n; i++) {
            System.out.println(n + i);
        }
    }

    public static void main(String[] args) {
        Modificadores modificadores = new Modificadores();

        modificadores.metodoSincronizado(7);
    }


}