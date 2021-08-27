public class Main {
    public static void main(String[] args) {

        Estudiante estudiante= new Estudiante("mbape","22","Masculino","760-20-45217");

        estudiante.mostrarDatos();

        System.out.println("Total suma de las notas: "+estudiante.mostrarDatos(85,72,88));
    }
}
