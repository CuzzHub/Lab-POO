public class Barco extends Vehiculo {
    private double eslora; // longitud en metros
    private int numTripulantes;

    public Barco(String marca, String modelo, int anio, double velocidadMax, double eslora, int numTripulantes) {
        super(marca, modelo, anio, velocidadMax);
        setEslora(eslora);
        setNumTripulantes(numTripulantes);
    }

    public double getEslora() {
        return eslora;
    }

    public int getNumTripulantes() {
        return numTripulantes;
    }

    public void setEslora(double eslora) {
        if (eslora > 0) {
            this.eslora = eslora;
        } else {
            System.out.println("Error: la eslora debe ser mayor a 0.");
        }
    }

    public void setNumTripulantes(int numTripulantes) {
        if (numTripulantes >= 0) {
            this.numTripulantes = numTripulantes;
        } else {
            System.out.println("Error: número de tripulantes no válido.");
        }
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" | Eslora: %.1f m | Tripulantes: %d", eslora, numTripulantes);
    }
}