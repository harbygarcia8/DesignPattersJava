public class Main {


    public static void saludar() {
        System.out.println("Hola Harby");
    }

    public static int multiplicarDosNumeros(int num1, int num2) {
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }

    public static void main(String[] args) {
        //Qué pueden devolver los métodos

        /*
        * Todos los métodos pueden devolver un valor específico o simplemente no devolver nada
        * Esto ocurre en la cabecera del método cuando le indicamos el tipo de dato que debe retornar
        *
        * void: No necesita la palabra return ya que no devolvería nada, simplemente se ejecuta.
        *
        * */

        saludar();
        int multiplicacion = multiplicarDosNumeros(5,4);
        System.out.println(multiplicacion);


    }
}