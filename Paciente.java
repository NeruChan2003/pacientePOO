public class Paciente {

    String nombre;
    String apellido;
    int edad;
    double altura;

    public String mostrarNombre() {
        System.out.println("Se llama" + this.nombre);
        return nombre;
    }

    public String mostrarApellido() {
        System.out.println("Su apellido es " + this.apellido);
        return apellido;
    }

    public int mostrarEdad() {
        System.out.println("Tiene " + this.edad);
        return edad;
    }

    public double mostrarAltura() {
        System.out.println("Mide " + this.altura);
        return altura;
    }

}
