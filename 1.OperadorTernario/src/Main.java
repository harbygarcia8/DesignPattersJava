public class Main {
    public static void main(String[] args) {
        /*
        ¿Qué son los operadores ternarios?
            Son una manera de escribir bloques if/else con menos código para que tus programas sean más compactos
        */

        boolean condicion = false;
        if (condicion) {
            System.out.println("La condición se cumple");
        } else {
            System.out.println("La condición no se cumple");
        }

        String textoSalida = condicion ? "La condición se cumple" : "La condición no se cumple";

        System.out.println(textoSalida);

    }
}