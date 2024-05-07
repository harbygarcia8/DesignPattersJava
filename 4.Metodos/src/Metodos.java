public class Metodos {


    public static int sumaDenumeros(int a, int b) {
        int c = a+b;
        System.out.println();
        return c;
    }

    public static void main(String[] args) {
        //Qué son y para que sirven los métodos?

        /*
        * Los métodos son partes de código que podemos almacenar
        * para volver reutilizable esa misma parte y así evitar reescribir el mismo código*/

        int a = 5;
        int b = 3;
        int c;

        c = a + b;

        System.out.println(c);


        int a1 = 15;
        int b1 = 30;
        int c1;

        c1 = a1 + b1;

        System.out.println(c1);


        System.out.println(sumaDenumeros(50,35));
        System.out.println(sumaDenumeros(10,25));
        System.out.println(sumaDenumeros(1,2));






    }
}


