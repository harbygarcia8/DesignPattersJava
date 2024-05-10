import java.util.Scanner;

public class UsuarioIO {
    public static void main(String[] args) {
        //Instanciamos el objeto sc
        Scanner sc = new Scanner(System.in);

        System.out.println("Vamos a hacer una suma");

        System.out.println("Introduzca el primer número");
        int num1 = (int) sc.nextDouble();

        System.out.println("Introduzca el segundo número");
        int num2 = sc.nextInt();

        int suma = num1 + num2;

        System.out.println("La suma es: " + suma);

        sc.close(); // Cerramos flujo de entrada

    }
}