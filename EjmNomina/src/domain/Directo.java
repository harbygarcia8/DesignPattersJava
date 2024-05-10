package domain;

public class Directo extends Empleado{

    public static final double SALUD = 0.04;
    public static final double PENSION = 0.065;
    private long salario;


    public Directo(String nombre, long salario) {
        super(nombre);
        setSalario(salario) ;
    }

    @Override
    public long calcularSalario() {
        long calcularSalario = getSalario() - (calcularSalud() + calcularPension());
        return calcularSalario;
    }

    public long calcularSalud() {
        return (long) (getSalario()*SALUD);
    }

    public long calcularPension() {
        return (long) (getSalario()*PENSION);
    }

    public long getSalario() {
        return salario;
    }

    public void setSalario(long salario) {
        this.salario = salario;
    }



}
