public class DocenteInvestigador extends Docente {

    private int publicaciones;

    public DocenteInvestigador() {
        super();
        this.publicaciones = 0;
    }

    public void setPublicaciones(int publicaciones) {
        if (publicaciones < 0) {
            System.out.println("Error: las publicaciones deben ser mayor o igual a 0.");
        } else {
            this.publicaciones = publicaciones;
        }
    }

    public int getPublicaciones() {
        return publicaciones;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos(); // Reutiliza datos de Docente (que a su vez usa PersonaAcademica)
        System.out.println("Publicaciones: " + publicaciones);
    }

    @Override
    public double calcularPago() {
        double pagoBase = super.calcularPago(); // horasClase * valorHora
        double bonoPublicaciones = publicaciones * 20;
        return pagoBase + bonoPublicaciones;
    }

    public double calcularPago(double bonoExtra) {
        return calcularPago() + bonoExtra;
    }

    @Override
    public void describirRol() {
        System.out.println("Rol: Docente investigador con producción académica.");
    }
}