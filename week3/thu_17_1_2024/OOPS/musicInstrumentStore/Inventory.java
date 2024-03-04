package musicInstrumentStore;

import java.util.HashMap;
import java.util.Map;

class Inventory {
    private Map<String, Instrument> instruments;

    public Inventory() {
        this.instruments = new HashMap<>();
    }

    public void addInstrument(Instrument instrument) {
        instruments.put(instrument.getSerialNumber(), instrument);
        System.out.println("Added " + instrument + " to the inventory.");
    }

    public Instrument findInstrument(String serialNumber) {
        return instruments.get(serialNumber);
    }

    public void displayInventory() {
        System.out.println("\nCurrent Inventory:");
        for (Instrument instrument : instruments.values()) {
            System.out.println("- " + instrument);
        }
    }
}
