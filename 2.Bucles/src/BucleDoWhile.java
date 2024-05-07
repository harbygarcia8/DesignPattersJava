public class BucleDoWhile {
    public static void main(String[] args) {
        //Bucles do-while

        /*
        Estos son los únicos bucles que se ejecutan antes de
        comprobar si se cumple o no la condición, por lo tanto
        se usan para primero disparar y luego preguntar (y menús)
         */

        int i = 2;

        do {
            int incremental = i++;
            float divisiblePorDos = (float) incremental / 2;
            System.out.println("Valor de i: " + incremental + " y su división es 2, el resultado es: " + divisiblePorDos);

        } while (i < 10);
        System.out.println("He salido del ciclo do-while");

    }
}
