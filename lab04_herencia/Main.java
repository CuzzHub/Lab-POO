public class Main {
    public static void main(String[] args) {
        System.out.println("=== Batalla RPG ===\n");

        Guerrero thorin = new Guerrero("Thorin", 5, 200, 85, "Cota de Malla");
        Mago gandalf = new Mago("Gandalf", 8, 200, 120, "Evocación");
        Arquero legolas = new Arquero("Legolas", 6, 120, 30, 0.95);

        System.out.println("-- Ronda 1: Ataques --");
        thorin.atacar();
        System.out.println();
        gandalf.atacar();
        System.out.println();
        legolas.atacar();

        System.out.println("\n-- Ronda 2: Defensas --");
        thorin.defender();
        gandalf.defender();
        legolas.defender();

        System.out.println("\n-- Daño recibido --");
        thorin.recibirDanio(60);
        gandalf.recibirDanio(200);

        System.out.println("\n-- Estado final --");
        System.out.println(thorin);
        System.out.println(gandalf);
        System.out.println(legolas);
    }
}
