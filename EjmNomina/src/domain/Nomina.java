package domain;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private List<Empleado> empleados;

    public Nomina(List<Empleado> empleados) {
        this.empleados = new ArrayList<>();
    }

    public void calcularNomina() {
        this.empleados.forEach(empleado -> {
            System.out.println(empleado.getNombre() + "se gana " + empleado.calcularSalario());
        });

    }

    public void listarDirectos() {
        this.empleados.forEach(empleado -> {
            if (empleado instanceof Directo) {
                System.out.println(empleado.getNombre() + " es un empleado directo");
            }
        });

    }

    public void listarFreelancer() {
        this.empleados.forEach(freelance -> {
            if (freelance instanceof Freelance) {
                System.out.println(freelance.getNombre() + " es un empleado freelancer");
            }
        });

    }

    public void listarPromotores() {
        this.empleados.forEach(promotor -> {
            if(promotor instanceof Promotor) {
                System.out.println(promotor.getNombre() + " es un empleado promotor");
            }
        });

    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}
