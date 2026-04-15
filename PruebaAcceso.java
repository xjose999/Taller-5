public class PruebaAcceso {
    public static void main(String[] args) {
        // 4. Verificación de acceso
        Producto p = new Producto("Monitor Gamer", 850000.0, 15);

        // Podemos acceder directamente a las propiedades
        p.precio = 800000.0; // Cambiamos el precio directamente

        System.out.println("Accediendo directamente al nombre: " + p.nombre);

        // Llamamos al método
        p.mostrarInfo();
    }
}