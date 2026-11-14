public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Transporte Multimodal ===\n");

        // 1. Creación de un objeto de cada tipo
        Automovil auto = new Automovil("Toyota", "Corolla", 2022, 180.0, 4, false);
        Avion avion = new Avion("Boeing", "737", 2019, 850.0, 2, 12500.0);
        Barco barco = new Barco("Ferretti", "550", 2020, 45.0, 16.8, 4);

        // 2. Impresión inicial
        System.out.println("-- Automovil --");
        System.out.println(auto.toString());
        System.out.println();

        // 3. Prueba de las validaciones de los setters con valores incorrectos a propósito
        auto.setAnio(1800);       // Debe mostrar mensaje de error
        auto.setNumPuertas(10);   // Debe mostrar mensaje de error
        System.out.println();

        // 4. Corrección de valores con datos válidos y nueva impresión
        auto.setAnio(2023);
        auto.setNumPuertas(4);
        System.out.println("\n-- Automovil (Corregido) --");
        System.out.println(auto.toString());
        System.out.println();

        System.out.println("-- Avion --");
        System.out.println(avion.toString());
        System.out.println();

        System.out.println("-- Barco --");
        System.out.println(barco.toString());
    }
}