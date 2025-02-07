// Main class to test the implementation
public class Main {
    public static void main(String[] args) {
        // Create Pandav objects
        Pandav arjun = new Pandav();
        Pandav bheem = new Pandav();

        // Create Kaurav objects
        Kaurav duryodhan = new Kaurav();
        Vikarn vikarn = new Vikarn();  // Special Kaurav

        // Call the methods of Pandavs
        System.out.println("Arjun:");
        arjun.fight();
        arjun.obey();
        arjun.kind();

        System.out.println("\nBheem:");
        bheem.fight();
        bheem.obey();
        bheem.kind();

        // Call the methods of Kauravs
        System.out.println("\nDuryodhan:");
        duryodhan.fight();
        duryodhan.disobey();
        duryodhan.cruel();

        System.out.println("\nVikarn:");
        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}