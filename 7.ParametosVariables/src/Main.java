public class Main {

    public static int summary(int ...n) {
        int suma = 0;
        for (int i : n) {
            suma +=i;
        }
        return suma;
    }

    public static void main(String[] args) {


        //Qué son los parámetos variables?
        /*
        * Es la manera de permitir que un método pueda recibir
        * la cantidad de parámetros siempre que sean del mismo tipo de dato
        */


        int sumaMultiplesParameters = summary(1,2,3,4,5,6,7,8,9);
        int sumaDeDosParameters = summary(3,5);

        System.out.println(sumaMultiplesParameters);
        System.out.println(sumaDeDosParameters);

    }
}