import java.util.ArrayList;

public class GestorBatalla {
    private ArrayList<String> historial;

    public GestorBatalla() {
        this.historial = new ArrayList<>();
    }

    public void ejecutarAtaque(Personaje atacante) {
        int danio = atacante.calcularDanio();
        atacante.atacar();
        historial.add(atacante.getNombre() + " atacó solo (daño: " + danio + ")");
    }

    public void ejecutarAtaque(Personaje atacante, Personaje defensor) {
        int danio = atacante.calcularDanio();
        atacante.atacar();
        defensor.recibirDanio(danio);
        defensor.defender();
        
        String evento = atacante.getNombre() + " atacó a " + defensor.getNombre() + " (daño: " + danio + ")";
        if (defensor.getVida() <= 0) {
            evento += " - " + defensor.getNombre() + " derrotado";
            System.out.println(defensor.getNombre() + " ha sido derrotado.");
        }
        historial.add(evento);
    }

    public void ejecutarAtaque(Personaje[] equipo) {
        System.out.println("[BATALLA] Equipo completo ataca → " + equipo.length + " personajes");
        String nombresEquipo = "";
        for (int i = 0; i < equipo.length; i++) {
            equipo[i].atacar();
            nombresEquipo += equipo[i].getNombre() + (i < equipo.length - 1 ? ", " : "");
        }
        historial.add("Ataque en equipo: " + nombresEquipo);
    }

    public void mostrarHistorial() {
        System.out.println("\n-- Historial --");
        for (int i = 0; i < historial.size(); i++) {
            System.out.println((i + 1) + ". " + historial.get(i));
        }
    }

    public void limpiarHistorial() {
        historial.clear();
    }