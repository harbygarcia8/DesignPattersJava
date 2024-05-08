public class Estaticidad {
    public static void main(String[] args) {
        ClaseConStatic claseConStatic1 = new ClaseConStatic(1);
        ClaseConStatic.saludarEstatico();

        ClaseConStatic claseConStatic2 = new ClaseConStatic(2);
        ClaseConStatic claseConStatic3 = new ClaseConStatic(3);
        ClaseConStatic claseConStatic4 = new ClaseConStatic(546);

        System.out.println(ClaseConStatic.getNumeroDeCreaciones());


    }
}
