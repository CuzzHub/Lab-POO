public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG — Sistema con Manejo de Excepciones ===\n");

        // Instancias de prueba (suponiendo constructores estándar del juego)
        Druida druida = new Druida("Sylva", 6, 150, "Raíces", 100);
        Nigromante nigromante = new Nigromante("Malachar", 6, 120, "Sombra", 100);
        Arquero sinFlechas = new Arquero("Legolas", 6, 150, "Arco Largo", 0, 95);
        Druida druida2 = new Druida("Sylva 2", 6, 150, "Raíces", 100);
        Druida personajeDerrotado = new Druida("Caído", 6, 0, "Nada", 100);
        personajeDerrotado.setEstaVivo(false); // Dependiendo de cómo manejen el estado

        MotorCombate motor = new MotorCombate();

        // Escenario 1 — Turno normal sin excepción
        motor.ejecutarTurno(druida, nigromante);

        // Escenario 2 — Personaje derrotado intenta atacar
        try {
            druida.recibirDanio(9999); 
        } catch (Exception ignored) {}
        motor.ejecutarTurno(druida, nigromante);

        // Escenario 3 — Arquero sin flechas
        motor.ejecutarTurno(sinFlechas, nigromante);

        // Escenario 4 — Curar aliado derrotado
        System.out.println("\n-- Intento de curar aliado derrotado --");
        try {
            druida2.curarAliado(personajeDerrotado);
        } catch (RpgException e) {
            System.out.println("No se pudo curar: " + e.getMessage());
        }

        // Escenario 5 — Daño negativo con finally
        System.out.println("\n-- Bloque manual try-catch-finally --");
        try {
            nigromante.recibirDanio(-50);
        } catch (AccionInvalidaException e) {
            System.out.println("Capturado: " + e.getMessage());
        } finally {
            System.out.println("El bloque finally siempre se ejecuta.");
        }

        // Escenario 6 — Mostrar bitácora completa
        System.out.println();
        motor.mostrarBitacora();
    }
}
