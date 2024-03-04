package musicInstrumentStore;

import java.util.ArrayList;
import java.util.List;

class Musician {
    private String name;
    private List<Instrument> ownedInstruments;

    public Musician(String name) {
        this.name = name;
        this.ownedInstruments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Instrument> getOwnedInstruments() {
        return ownedInstruments;
    }

    public void addInstrumentToInventory(Instrument instrument) {
        ownedInstruments.add(instrument);
        System.out.println(name + " added " + instrument + " to their inventory.");
    }

    public void sellInstrument(Instrument instrument, Musician buyer) {
        if (ownedInstruments.contains(instrument)) {
            ownedInstruments.remove(instrument);
            buyer.addInstrumentToInventory(instrument);
            System.out.println(name + " sold " + instrument + " to " + buyer.getName() + ".");
        } else {
            System.out.println(name + " does not own " + instrument + ". Sale failed.");
        }
    }
}
