import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DocenteInvestigador di = new DocenteInvestigador();


        System.out.print("Ingrese el código: ");
        String codigo = scanner.nextLine();
        di.setCodigo(codigo);

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();
        di.setNombre(nombre);

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        di.setEdad(edad);

        System.out.print("Ingrese las horas de clase (1-40): ");
        int horas = scanner.nextInt();
        di.setHorasClase(horas);

        System.out.print("Ingrese el valor por hora: ");
        double valorHora = scanner.nextDouble();
        di.setValorHora(valorHora);

        System.out.print("Ingrese el número de publicaciones: ");
        int publicaciones = scanner.nextInt();
        di.setPublicaciones(publicaciones);

        scanner.close();

        PersonaAcademica persona = di;

        System.out.println();

        persona.mostrarDatos();
        persona.describirRol();

        System.out.println("Pago final: $" + persona.calcularPago());

        System.out.println("Pago con bono extra: $" + di.calcularPago(50));
    }
}
