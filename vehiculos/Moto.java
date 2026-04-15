package vehiculos;

// 2. Hereda de Vehículo (Mismo paquete)
public class Moto extends Vehiculo {
    public Moto(String tipo) {
        super(tipo);
    }

    public void mostrarTipo() {
        // Esto funciona porque están en el mismo paquete
        System.out.println("Soy una moto de tipo: " + tipo);
    }
}
