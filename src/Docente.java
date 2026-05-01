public class Docente extends PersonaAcademica {

    private int horasClase;
    private double valorHora;

    public Docente() {
        super();
        this.horasClase = 0;
        this.valorHora = 0.0;
    }

    public void setHorasClase(int horas) {
        if (horas < 1 || horas > 40) {
            System.out.println("Error: las horas de clase deben estar entre 1 y 40.");
        } else {
            this.horasClase = horas;
        }
    }

    public void setValorHora(double valorHora) {
        if (valorHora <= 0) {
            System.out.println("Error: el valor por hora debe ser mayor a 0.");
        } else {
            this.valorHora = valorHora;
        }
    }

    // Getters
    public int getHorasClase() {
        return horasClase;
    }

    public double getValorHora() {
        return valorHora;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); // Reutiliza datos de PersonaAcademica
        System.out.println("Horas de clase: " + horasClase);
        System.out.println("Valor por hora: " + valorHora);
    }

    @Override
    public double calcularPago() {
        return horasClase * valorHora;
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente con carga horaria asignada.");
    }
}