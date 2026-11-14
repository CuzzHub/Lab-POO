public class Arquero extends Personaje {
    private int flechasDisponibles;
    private int precision;

    public Arquero(String nombre, int nivel, int vida, int flechasDisponibles, int precision) {
        super(nombre, nivel, vida);
        this.flechasDisponibles = flechasDisponibles;
        this.precision = precision;
    }

    @Override
    public int calcularDanio() {
        return precision * flechasDisponibles;
    }

    @Override
    public void atacar() {
        super.atacar();
        if (flechasDisponibles > 0) {
            flechasDisponibles--;
            System.out.println(nombre + " dispara una flecha. Flechas restantes: " + flechasDisponibles);
        } else {
            System.out.println(nombre + " no tiene flechas disponibles.");
        }
    }

    public int getFlechasDisponibles() { return flechasDisponibles; }
    public int getPrecision() { return precision; }
}