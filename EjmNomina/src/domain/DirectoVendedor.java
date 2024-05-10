package domain;

public class DirectoVendedor extends Directo {

    public static final double SALARIO_BASE = 1000000;
    public static final double COMISION_BAJA = 0.044;
    public static final double COMISION_ALTA = 0.055;
    private long ventasDelMes;

    public DirectoVendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre, salario);
        setVentasDelMes(ventasDelMes);
    }

    public long calcularComision() {
        if (getSalario() < SALARIO_BASE) {
            return (long) (getSalario() - (getSalario()*COMISION_ALTA));
        } else {
            return (long) (getSalario() - (getSalario()*COMISION_BAJA));
        }
    }

    public long getVentasDelMes() {
        return ventasDelMes;
    }

    public void setVentasDelMes(long ventasDelMes) {
        this.ventasDelMes = ventasDelMes;
    }
}
