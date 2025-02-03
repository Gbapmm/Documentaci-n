/**
 * Esta clase representa un avión con diversos métodos para simular su funcionamiento.
 */
public class Avion {

    private String modelo;
    private double velocidad;
    private int capacidadPasajeros;
    private boolean motorEncendido;

    /**
     * Constructor de la clase Avion.
     * 
     * @param modelo El modelo del avión.
     * @param velocidad La velocidad máxima del avión en km/h.
     * @param capacidadPasajeros La capacidad máxima de pasajeros del avión.
     */
    public Avion(String modelo, double velocidad, int capacidadPasajeros) {
        this.modelo = modelo;
        this.velocidad = velocidad;
        this.capacidadPasajeros = capacidadPasajeros;
        this.motorEncendido = false;
    }

    /**
     * Enciende el motor del avión.
     */
    public void encenderMotor() {
        if (!motorEncendido) {
            motorEncendido = true;
            System.out.println("El motor está encendido.");
        } else {
            System.out.println("El motor ya está encendido.");
        }
    }

    /**
     * Apaga el motor del avión.
     */
    public void apagarMotor() {
        if (motorEncendido) {
            motorEncendido = false;
            System.out.println("El motor está apagado.");
        } else {
            System.out.println("El motor ya está apagado.");
        }
    }

    /**
     * Simula el vuelo del avión aumentando su velocidad.
     * 
     * @param incremento La cantidad de km/h a incrementar en la velocidad actual.
     */
    public void volar(double incremento) {
        if (motorEncendido) {
            velocidad += incremento;
            System.out.println("El avión ahora vuela a " + velocidad + " km/h.");
        } else {
            System.out.println("El motor está apagado. No puedes volar.");
        }
    }

    /**
     * Muestra información básica del avión.
     */
    public void mostrarInformacion() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad máxima: " + velocidad + " km/h");
        System.out.println("Capacidad de pasajeros: " + capacidadPasajeros);
    }

    /**
     * Simula el aterrizaje del avión, reduciendo su velocidad a cero.
     */
    public void aterrizar() {
        if (motorEncendido) {
            velocidad = 0;
            System.out.println("El avión ha aterrizado exitosamente.");
            apagarMotor();
        } else {
            System.out.println("El avión ya está en tierra. El motor está apagado.");
        }
    }

    public static void main(String[] args) {
        // Crear un objeto Avion
        Avion avion = new Avion("Boeing 747", 900, 350);

        // Mostrar información básica
        avion.mostrarInformacion();

        // Encender el motor y volar
        avion.encenderMotor();
        avion.volar(150);

        // Aterrizar
        avion.aterrizar();
    }
}
