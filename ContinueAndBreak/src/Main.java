public class Main {
    public static void main(String[] args) {
        String[] nombresPersonas = {"Harby", "Maria", "Fernanda", "Sulma", "Jhon"};

        //Bucle utilizando el continue;
        for (int i = 0; i < nombresPersonas.length; i++) {
            if(i == 1)
                continue;
            System.out.println(nombresPersonas[i]);
        }

        for (int i=0; i < nombresPersonas.length; i++) {
            if (i > 3)
                //Con break no llega a la última posición del array y
                // solo llegará hasta donde la condición lo determine
                break;
            System.out.println(nombresPersonas[i]);
        }

    }
}
