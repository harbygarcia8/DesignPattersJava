public class Break {
    public static void main(String[] args) {
        //Qué es la palabra break?

        /*
        Break es una palabra reservada con la que se fuerza la salida en un bucle y continua el código que hay después
        Break nos permite salir de un bucle cuando hayamos querido alcanzar una condición
        */

        int contador = 10;

        for (int i = 0; i < contador; i++) {
            if (i == 5) {
                System.out.println("Valor de i: " + i + " y salimos del ciclo");
                break;
            }
            System.out.println("Valor de i: " + i);
        }
        System.out.println("Salió del bucle");
    }
}