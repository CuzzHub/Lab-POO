public class Gato extends Animal {
    private String colorPelaje;
    private boolean esDeInterior;

    public Gato(String nombre, int edad, double peso, String colorPelaje, boolean esDeInterior) {
        super(nombre, edad, peso);
        this.colorPelaje = colorPelaje;
        this.esDeInterior = esDeInterior;
    }

    public void maullar() {
        System.out.println(getNombre() + " dice: ¡Miau!");
    }

    public void ronronear() {
        System.out.println(getNombre() + " está ronroneando...");
    }

    @Override
    public String toString() {
        String interiorStr = esDeInterior ? "Sí" : "No";
        return super.toString() + String.format(" | Color: %s | Interior: %s", colorPelaje, interiorStr);
    }
}