public class CreacionObjetos {
    public static void main(String[] args) {
        PersonaEjemplo persona = new PersonaEjemplo("Harby", 27,90.5);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getPeso());
        persona.saludar();

        PersonaEjemplo personaDos = new PersonaEjemplo("Pepito", 18,71.5);
        System.out.println(personaDos.getNombre());
        System.out.println(personaDos.getEdad());
        System.out.println(personaDos.getPeso());
        personaDos.saludar();
    }
}