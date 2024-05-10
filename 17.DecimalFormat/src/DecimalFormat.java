public class DecimalFormat {

    public static void main(String[] args) {

        //Cuando queremos manejar de una manera clara los decimales de algún número.
        double numero = 8723.4124;

        java.text.DecimalFormat dfCeros = new java.text.DecimalFormat("000000.0000000");
        java.text.DecimalFormat dfNum = new java.text.DecimalFormat("#####.########");

        String formatNum = dfCeros.format(numero);
        String formatNums = dfNum.format(numero);

        System.out.println(formatNum + " " + formatNums);


    }

}