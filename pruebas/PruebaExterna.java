package pruebas;

import vehiculos.Vehiculo;
import vehiculos.Moto;

public class PruebaExterna {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("Terrestre");
        Moto m = new Moto("Deportiva");

        // 3. INTENTOS DE ACCESO (Darán Error de Compilación)

        // Error: 'tipo' is not public in 'vehiculos.Vehiculo';
        // cannot be accessed from outside package
        // System.out.println(v.tipo);

        // Error: 'tipo' has package-private access
        // m.tipo = "Scooter";
    }
}