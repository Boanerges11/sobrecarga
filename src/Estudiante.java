public class Estudiante extends Persona{  // clase hija

    private String sexo;   //atributos
    private String carne;
    private double nota1;
    private double nota2;
    private double nota3;

    public String getSexo() {        //getters and setters
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public Estudiante(String nombre, String edad,String sexo,String carne) { // constructor 1
        super(nombre, edad);
        this.sexo=sexo;
        this.carne=carne;

    }

    public Estudiante(double nota1,double nota2, double nota3) { // constructor 2 utilizando los conocimientos
        this.nota1=nota1;                                        //de sobrecarga
        this.nota2=nota2;
        this.nota3=nota3;
    }


    public void mostrarDatos(){ // metodo para mostrar datos
        System.out.println("nombre: "+getNombre());
        System.out.printf("edad: "+getEdad());
        System.out.println("sexo: "+sexo);
        System.out.println("carne: "+carne);
    }

    public double mostrarDatos(double nota1,double nota2,double nota3){ //metodo para mostrar la suma de las notas
        double total;                                                   //utilizando la funcion de sobrecarga
            total=nota1+nota2+nota3;
            return total;
    }
   

}
