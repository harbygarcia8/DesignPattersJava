public class Perro extends AnimalAbstracto {

    private String name;

    //SobreEscripcion: @Override
    @Override
    public void hacerSonido() {
        System.out.println("El perrito dice guau... guau");
    }

    public Perro(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Perro perroEjemplo = new Perro("Spike");

        perroEjemplo.caminar(perroEjemplo.getName());
        perroEjemplo.hacerSonido();
    }


}
