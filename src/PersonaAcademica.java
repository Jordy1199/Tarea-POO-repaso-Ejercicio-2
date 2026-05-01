public class PersonaAcademica {

    private String codigo;
    private String nombre;
    private int edad;

    public PersonaAcademica() {
        this.codigo = "";
        this.nombre = "";
        this.edad = 0;
    }

    public void setCodigo(String codigo) {
        if (codigo == null || codigo.trim().isEmpty()) {
            System.out.println("Error: el código no puede estar vacío.");
        } else {
            this.codigo = codigo;
        }
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            System.out.println("Error: el nombre no puede estar vacío.");
        } else {
            this.nombre = nombre;
        }
    }

    public void setEdad(int edad) {
        if (edad < 18) {
            System.out.println("Error: la edad debe ser mayor o igual a 18.");
        } else {
            this.edad = edad;
        }
    }

    // Getters
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarDatos() {
        System.out.println("Código: " + codigo);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public double calcularPago() {
        return 0.0;
    }

    public void describirRol() {
        System.out.println("Rol: Persona académica general.");
    }
}