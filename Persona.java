public class Persona {
    // Atributo privado: solo visible dentro de esta clase
    private String nombre;

    // Atributo de paquete (default): visible para clases en la misma carpeta
    int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Métodos Getter y Setter para el atributo privado
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}