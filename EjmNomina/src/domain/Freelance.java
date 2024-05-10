package domain;

public class Freelance extends Empleado{

    private long valorHora;
    private double horasTrabajadas;

    public Freelance(String nombre, long valorHora, double horasTrabajadas) {
        super(nombre);
        setValorHora(valorHora);
        setHorasTrabajadas(horasTrabajadas);
    }

    @Override
    public long calcularSalario() {
        long salarioCalculado = (long) (getValorHora() * getHorasTrabajadas());
        return salarioCalculado;
    }

    public long getValorHora() {
        return valorHora;
    }

    public void setValorHora(long valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
}
