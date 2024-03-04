package musicInstrumentStore;

public class MusicStore {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Instrument guitar = new Instrument("G123", "Fender", "Stratocaster", 999.99);
        Instrument piano = new Instrument("P456", "Yamaha", "Grand Piano", 4999.99);
        Instrument trumpet = new Instrument("T789", "Bach", "Professional Trumpet", 1299.99);

        inventory.addInstrument(guitar);
        inventory.addInstrument(piano);
        inventory.addInstrument(trumpet);

        inventory.displayInventory();

        Musician musician1 = new Musician("Alice");
        Musician musician2 = new Musician("Bob");

        musician1.addInstrumentToInventory(guitar);
        musician2.addInstrumentToInventory(piano);

        System.out.println("\nMusicians' Inventories:");
        System.out.println(musician1.getName() + ": " + musician1.getOwnedInstruments());
        System.out.println(musician2.getName() + ": " + musician2.getOwnedInstruments());

        // Simulate a sale
        musician1.sellInstrument(guitar, musician2);

        // Display updated inventories after the sale
        System.out.println("\nUpdated Musicians' Inventories:");
        System.out.println(musician1.getName() + ": " + musician1.getOwnedInstruments());
        System.out.println(musician2.getName() + ": " + musician2.getOwnedInstruments());

        // Display the current inventory after the sale
        inventory.displayInventory();
    }
}

