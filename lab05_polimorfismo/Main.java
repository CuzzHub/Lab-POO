public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG — Demostración de Polimorfismo ===\n");

        Personaje p1 = new Guerrero("Thorin", 5, 200, 85, "Cota de Malla");
        Personaje p2 = new Mago("Gandalf", 8, 120, 150, "Fuego");
        Personaje p3 = new Arquero("Legolas", 6, 150, 30, 95);

        System.out.println("-- calcularDanio() por tipo --");
        System.out.println(p1.getNombre() + " (Guerrero)\tdaño: " + p1.calcularDanio() + "\t← fuerza(85) * nivel(5)");
        System.out.println(p2.getNombre() + " (Mago)\tdaño: " + p2.calcularDanio() + "\t← mana(150) * nivel(8)");
        System.out.println(p3.getNombre() + " (Arquero)\tdaño: " + p3.calcularDanio() + "\t← precision(95) * flechas(30)\n");

        System.out.println("-- Arreglo polimórfico --");
        Personaje[] equipo = { p1, p2, p3 };
        for (Personaje p : equipo) {
            p.atacar();
        }
        System.out.println();

        System.out.println("-- GestorBatalla --");
        GestorBatalla gestor = new GestorBatalla();

        System.out.print("[BATALLA] ");
        gestor.ejecutarAtaque(p1);
        
        System.out.print("[BATALLA] ");
        gestor.ejecutarAtaque(p2, p3);
        
        gestor.ejecutarAtaque(equipo);

        gestor.mostrarHistorial();

        System.out.println("\n-- instanceof --");
        for (Personaje p : equipo) {
            if (p instanceof Guerrero) {
                System.out.println(p.getNombre() + " es un Guerrero.");
            } else if (p instanceof Mago) {
                System.out.println(p.getNombre() + " es un Mago.");
            } else if (p instanceof Arquero) {
                System.out.println(p.getNombre() + " es un Arquero.");
            }
        }

        System.out.println("\n-- Parte 4: Sobrecarga adicional (Entrenar Guerrero) --");
        Guerrero g = (Guerrero) p1;
        g.entrenar();
        g.entrenar(2);
        g.entrenar(1, true);
    }
}