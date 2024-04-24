import java.util.Scanner;

public class MainPaciente {
    public static void main(String[] args) {
        Scanner pa = new Scanner(System.in);
        System.out.println("Ingresa el nombre del paciente: ");

        String nombre = pa.next();
        System.out.println("Ingresa el apellido del paciente: ");

        String apellido = pa.next();
        System.out.println("Ingresa la edad del paciente: ");

        int edad = pa.nextInt();
        System.out.println("Ingresa tu altura del paciente: ");

        double altura = pa.nextDouble();
        Paciente paci = new Paciente();

        paci.nombre = nombre;
        paci.apellido = apellido;
        paci.edad = edad;
        paci.altura = altura;

        paci.mostrarNombre();
        paci.mostrarApellido();
        paci.mostrarEdad();
        paci.mostrarAltura();
    }
}
