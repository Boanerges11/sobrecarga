public class Persona {  //clase padre
    private String nombre;
    private String edad;

    public Persona(String nombre,String edad){  //constructor de la clase padre
        this.nombre=nombre;
        this.edad=edad;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }


}
