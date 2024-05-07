public class BucleWhile {
    public static void main(String[] args) {
        //Bucles while
        /*
        Estos bucles se emplean cuando no sabemos cuántas veces tendremos
        que iterar sobre un mismo código hasta que la condición del while no se cumpla
        */

        int numeroDeIteraracion = 0;

        while (numeroDeIteraracion < 3) {
            numeroDeIteraracion++;

            //Magia
            System.out.println("Esta es la iteración n°: " + numeroDeIteraracion);
        }
        System.out.println("Total de iteraciones: " + numeroDeIteraracion);

    }
}
