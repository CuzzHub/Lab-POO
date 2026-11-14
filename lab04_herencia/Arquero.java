public class Arquero extends Personaje {
    private int flechasDisponibles;
    private double precision;

    public Arquero(String nombre, int nivel, int puntosVida, int flechasDisponibles, double precision) {
        super(nombre, nivel, puntosVida);
        this.flechasDisponibles = flechasDisponibles;
        this.precision = precision;
    }

    public int getFlechasDisponibles() {
        return flechasDisponibles;
    }

    public double getPrecision() {
        return precision;
    }

    @Override
    public void atacar() {
        System.out.println("[" + getNombre() + "] dispara una flecha con precisión del " + (int)(precision * 100) + "%.");
    }

    @Override
    public void defender() {
        System.out.println(getNombre() + " se desplaza ágilmente esquivando el ataque.");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}