public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG — Expansión: Nuevas Clases ===");
        System.out.println();

        System.out.println("-- Error esperado (línea comentada) --");
        // new Personaje("Prueba", 1, 100) -> cannot instantiate abstract class
        System.out.println("// new Personaje(...) -> cannot instantiate abstract class");
        System.out.println();

        Druida sylva = new Druida("Sylva", 7, 200, 180, 120, "Oso");
        Nigromante malachar = new Nigromante("Malachar", 6, 350, 220, "Necronomicón");
        Bardo finnian = new Bardo("Finnian", 5, 150, 60, "Laúd Mágico");

        System.out.println("-- Ataques y daño --");
        Personaje[] equipo = { sylva, malachar, finnian };
        for (Personaje p : equipo) {
            p.atacar();
        }
        System.out.println();

        System.out.println("-- Solo los Hechiceros lanzan hechizos --");
        for (Personaje p : equipo) {
            if (p instanceof Hechicero h) {
                h.lanzarHechizo();
            }
        }
        System.out.println();

        System.out.println("-- Solo los Sanadores curan --");
        malachar.recibirDanio(300);
        
        sylva.curarAliado(malachar);
        finnian.curarAliado(malachar);
        System.out.println();

        System.out.println("-- Estado final --");
        for (Personaje p : equipo) {
            System.out.println(p);
        }
    }
}