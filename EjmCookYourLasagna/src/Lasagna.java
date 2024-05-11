public class Lasagna {
    /*
    * Introducción:
    Lo esencial
        Java es un lenguaje de tipo estático, lo que significa que el tipo de una variable se conoce en tiempo de compilación.
        Asignar un valor a un nombre se conoce como definir una variable. Una variable se define especificando explícitamente su tipo.

    int explicitVar = 10;
        La actualización del valor de una variable se realiza a través del =operador. Aquí, =no representa igualdad matemática.
        *  Simplemente asigna un valor a una variable. Una vez definido, el tipo de variable nunca puede cambiar.

        int count = 1; // Assign initial value
        count = 2;     // Update to new value

    // Compiler error when assigning a different type
    // count = false;
    *
    Java es un lenguaje orientado a objetos y requiere que todas las funciones estén definidas en una clase.
    La palabra class es clave y se utiliza para definir una clase.

    class Calculator {
        // ...
    }
    Una función dentro de una clase se denomina método.
    Cada método puede tener cero o más parámetros.
    Todos los parámetros deben escribirse explícitamente; no hay inferencia de tipos para los parámetros.
    Del mismo modo, el tipo de devolución también debe hacerse explícito.
    Los valores se devuelven desde métodos que utilizan la  palabra return.
    Para permitir que otras clases llamen a un método, public se debe agregar el modificador de acceso.

    class Calculator {
        public int add(int x, int y) {
            return x + y;
        }
    }
    Invocar/llamar a un método se realiza especificando su clase y nombre de método y
    pasando argumentos para cada uno de los parámetros del método.

    int sum = new Calculator().add(1, 2);  // here the  "add" method has been called to perform the task of addition
    El alcance en Java se define entre los caracteres {y }.

    */


    public int  expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutesLess) {
        return expectedMinutesInOven() - minutesLess;
    }

    public int preparationTimeInMinutes(int preparation) {
        return preparation*2;
    }

    public int totalTimeInMinutes(int iLayer, int quantityLasagnaInHorn) {

        return preparationTimeInMinutes(iLayer) + quantityLasagnaInHorn;
    }



    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();
        System.out.println(lasagna.remainingMinutesInOven(30));
        System.out.println(lasagna.totalTimeInMinutes(3,20));
    }

    // TODO: define the 'expectedMinutesInOven()' method

    // TODO: define the 'remainingMinutesInOven()' method

    // TODO: define the 'preparationTimeInMinutes()' method

    // TODO: define the 'totalTimeInMinutes()' method


}
