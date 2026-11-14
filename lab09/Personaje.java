public class Personaje implements Combatiente {
    protected String nombre;
    protected int nivel;
    protected int vida;

    public Personaje(String nombre, int nivel, int vida) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
    }

    public int calcularDanio() {
        return nivel * 10;
    }

    @Override
    public void atacar() {
        System.out.println("[" + nombre + "] ataca con un golpe básico.");
    }

    @Override
    public void recibirDanio(int danio) {
        this.vida -= danio;
        if (this.vida < 0) {
            this.vida = 0;
        }
        System.out.println(nombre + " recibe " + danio + " puntos de daño. Vida restante: " + vida);
    }

    @Override
    public void defender() {
        System.out.println(nombre + " se defiende.");
    }

    public void mostrarEstado() {
        System.out.println("Personaje: " + nombre + " | Nivel: " + nivel + " | Vida: " + vida);
    }

    public void mostrarEstado(boolean detallado) {
        if (detallado) {
            System.out.println("=== ESTADO DETALLADO ===");
            System.out.println("Nombre: " + nombre + ", Nivel: " + nivel + ", Vida: " + vida);
        } else {
            mostrarEstado();
        }
    }

    public void mostrarEstado(String formato) {
        System.out.println(formato + " -> " + nombre + " (Nv." + nivel + ")");
    }

    public String getNombre() { return nombre; }
    public int getNivel() { return nivel; }
    public int getVida() { return vida; }
}