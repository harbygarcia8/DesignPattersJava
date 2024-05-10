import java.util.Scanner;

public class Math {
    public static void main(String[] args) {
        // 1 USD =
        double cop = 3.895;
        System.out.println("Un dolar son $" + cop +" pesos colombianos");

        double redondear = java.lang.Math.round(cop);
        double redondearMayor = java.lang.Math.ceil(cop);
        double redondearMenor = java.lang.Math.floor(cop);
        System.out.println(redondear + " " + redondearMenor +" " + redondearMayor);

        // MAX - MIN

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese primer número");
        float numeroUno = sc.nextFloat();
        System.out.println("Ingrese segundo número");
        float numeroDos = sc.nextFloat();

        float numeroMayor = java.lang.Math.max(numeroUno,numeroDos);
        float numeroMenor = java.lang.Math.min(numeroUno,numeroDos);

        System.out.println("Numero mayor es: " + numeroMayor + " y número menor es: " + numeroMenor);

        sc.close();
    }
}