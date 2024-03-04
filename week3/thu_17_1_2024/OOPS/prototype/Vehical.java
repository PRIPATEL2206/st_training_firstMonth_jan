package prototype;//Example for Prototype pattern

abstract class Vehical implements Cloneable{

    private String engine;
    
    private String model;

    private long price;

    public Vehical(String engine, String model, long price){
        this.engine = engine;
        this.model = model;
        this.price = price;
    }

    public String getEngine() {
        return engine;
    }
    public String getModel() {
        return model;
    }
    public long getPrice() {
        return price;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    protected Vehical clone() throws CloneNotSupportedException {
        return (Vehical)super.clone();
    }
}

