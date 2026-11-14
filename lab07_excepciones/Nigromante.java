public class Nigromante extends Personaje implements Hechicero {
    private int mana;
    private String grimorio;

    public Nigromante(String nombre, int nivel, int puntosVida, int mana, String grimorio) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
        this.grimorio = grimorio;
    }

    @Override
    public void atacar() {
        System.out.println("[" + nombre + "] drena la esencia vital. Daño: " + calcularDanio());
    }

    @Override
    public int calcularDanio() {
        return nivel * 50 + 90;
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(nombre + " lanza: ¡Maldición de decadencia! (maná: " + mana + ")");
    }

    @Override
    public int getMana() {
        return mana;
    }