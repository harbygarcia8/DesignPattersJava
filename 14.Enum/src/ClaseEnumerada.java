public enum ClaseEnumerada {
    //Las clases enumeradas sirven para hacer un listado de constantes.

    BAJO(0), MEDIO(1), ALTO(2);

    private int valor;

    ClaseEnumerada(int i) {
        this.valor = i;
    }

    public int getValor() {
        return valor;
    }
}