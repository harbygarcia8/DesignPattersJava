package domain;

public class Promotor extends Empleado{

    private int volantesRepartidos;
    private double valorVolante;
    private int comprasVolante;
    public static final int COMISION_POR_VOLANTE = 17000;

    public Promotor(String nombre, double valorVolante, int volantesRepartidos, int comprasVolante) {
        super(nombre);
        setVolantesRepartidos(volantesRepartidos);
        setValorVolante(valorVolante);
        setComprasVolante(comprasVolante);
    }

    @Override
    public long calcularSalario() {
        double comision = getComprasVolante()*COMISION_POR_VOLANTE;
        return (long) (getValorVolante()*getVolantesRepartidos() + comision);
    }

    public int getVolantesRepartidos() {
        return volantesRepartidos;
    }

    public void setVolantesRepartidos(int volantesRepartidos) {
        this.volantesRepartidos = volantesRepartidos;
    }

    public double getValorVolante() {
        return valorVolante;
    }

    public void setValorVolante(double valorVolante) {
        this.valorVolante = valorVolante;
    }

    public int getComprasVolante() {
        return comprasVolante;
    }

    public void setComprasVolante(int comprasVolante) {
        this.comprasVolante = comprasVolante;
    }
}
