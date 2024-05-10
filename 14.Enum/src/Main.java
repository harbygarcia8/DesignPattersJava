public class Main {
    public static void main(String[] args) {
        for (ClaseEnumerada variableEnum : ClaseEnumerada.values()) {
            System.out.println(variableEnum);
        }

        ClaseEnumerada nivel = ClaseEnumerada.MEDIO;
        switch (nivel) {
            case ALTO -> {
                System.out.println("El nivel es alto");
                break;
            }
            case MEDIO -> {
                System.out.println("El nivel es medio");
                break;
            }
            case BAJO -> {
                System.out.println("El nivel es bajo");
                break;
            }

            default -> throw new IllegalArgumentException("Valor inesperado: " + nivel);
        }

    }
}
