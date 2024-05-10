public class ClaseConStatic {
    //Qué es static en java?

    /*
     * La palabra static indica que esa variable, objeto o método pertenece a la propia clase
     * en vez de al objeto
     */


    static int numeroDeCreaciones;
    int id;



    public ClaseConStatic(int id) {
        this.id = id;
        numeroDeCreaciones++;
    }

    public static void saludarEstatico() {
        System.out.println("Hola, soy un método estático");
    }
    public int getId() {
        return id;
    }

    public static int getNumeroDeCreaciones() {
        return numeroDeCreaciones;
    }

    }