public class Guerrero extends Personaje {
    private int fuerza;
    private String armadura;

    public Guerrero(String nombre, int nivel, int vida, int fuerza, String armadura) {
        super(nombre, nivel, vida);
        this.fuerza = fuerza;
        this.armadura = armadura;
    }

    @Override
    public int calcularDanio() {
        return fuerza * getNivel();
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("¡" + nombre + " golpea con su espada causando " + calcularDanio() + " de daño!");
    }

    public void entrenar() {
        fuerza += 5;
        System.out.println(nombre + " entrenó. Nueva fuerza: " + fuerza);
    }

    public void entrenar(int sesiones) {
        fuerza += 5 * sesiones;
        System.out.println(nombre + " entrenó " + sesiones + " sesiones. Nueva fuerza: " + fuerza);
    }

    public void entrenar(int sesiones, boolean intensivo) {
        int incremento = 5 * sesiones;
        if (intensivo) {
            incremento *= 2;
        }
        fuerza += incremento;
        System.out.println(nombre + " entrenó intensivamente (" + sesiones + " sesiones). Nueva fuerza: " + fuerza);
    }

    public int getFuerza() { return fuerza; }
}