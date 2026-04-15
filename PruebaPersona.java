public class PruebaPersona {
    public static void main(String[] args) {
        Persona p = new Persona("Manuel", 20);

        // 1. Acceso a EDAD (De paquete): Funciona directamente
        p.edad = 21;
        System.out.println("Edad accesible directamente: " + p.edad);

        // 2. Acceso a NOMBRE (Privado): Daría error si fuera directo
        // p.nombre = "Jose"; // <-- ERROR DE COMPILACIÓN

        // Debe usarse el método público
        p.setNombre("Jose");
        System.out.println("Nombre accesible vía getter: " + p.getNombre());
    }
}