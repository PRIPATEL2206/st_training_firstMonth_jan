package prototype;//Example for Prototype pattern

class FourWheelerVehical extends Vehical{

    boolean isAutomatic;
    boolean hasSunroof;

    public FourWheelerVehical(String engine, String model, long price, boolean isAutomatic, boolean hasSunroof){
        super(engine, model, price);
        this.isAutomatic = isAutomatic;
        this.hasSunroof = hasSunroof;
    }

    @Override
    protected FourWheelerVehical clone() throws CloneNotSupportedException {
        return (FourWheelerVehical)super.clone();
    }

}

