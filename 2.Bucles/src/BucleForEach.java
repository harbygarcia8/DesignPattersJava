public class BucleForEach {
    public static void main(String[] args) {
        //Bucles for-each

        /*
        Estos Bucles recorren una variable que contienen varios valores del mismo tipo de dato
        */
        //Esta variable contiene varios nombres:
            String[] listadeNombres = {"Harby", "Maria", "Sulma", "Jhon"};

            /*
            Uso del bucle for-each para recorrerlos todos
            como la variable contenedora es de tipo String,
            debo usar ese mismo tipo de dato para recorrerlo
            */
            for (String variable : listadeNombres) {
                System.out.println(variable);
            }

    }
}
