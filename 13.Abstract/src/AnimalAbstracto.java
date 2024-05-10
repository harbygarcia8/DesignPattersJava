public abstract class AnimalAbstracto {

    //¿Qué es una clase abstracta?
    /*
    * Es una clase de la que se pueden heredar sus métodos
    * si se implementan en clases que la hereden.
    * */

    //Sus métodos se implementan sin cuerpo, porque el comportamiento del método es directamente dentro de la clase hija
    public abstract void hacerSonido();


    //Aunque sea una clase abstracta podemos definir métodos dentro de ellas
    // que no sean necesariamente abstractos
    public void caminar(String name) {
        System.out.println(name + " camina 1 hora");
        System.out.println(name + " camina 2 horas");
        System.out.println(name + " Ya no puede caminar más");
    }

}