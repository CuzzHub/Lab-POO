public class Mago extends Personaje {
    private int mana;
    private String elemento;

    public Mago(String nombre, int nivel, int vida, int mana, String elemento) {
        super(nombre, nivel, vida);
        this.mana = mana;
        this.elemento = elemento;
    }

    @Override
    public int calcularDanio() {
        return mana * getNivel();
    }

    @Override
    public void atacar() {
        super.atacar();
        System.out.println("¡" + nombre + " lanza una bola de fuego causando " + calcularDanio() + " de daño mágico!");
    }

    public int getMana() { return mana; }
}