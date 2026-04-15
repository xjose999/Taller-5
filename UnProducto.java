class Producto {
    // 1. Propiedades con acceso default (sin modificador)
    String nombre;
    double precio;
    int stock;

    // 2. Constructor con acceso default
    Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // 3. Método con acceso default
    void mostrarInfo() {
        System.out.println("PRODUCTO: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Unidades en Stock: " + stock);
        System.out.println("-------------------------");
    }
}
