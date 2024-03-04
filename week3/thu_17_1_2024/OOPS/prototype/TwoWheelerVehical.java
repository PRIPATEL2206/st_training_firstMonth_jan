package prototype;//Example for Prototype pattern

class TwoWheelerVehical extends Vehical{

    private boolean isElectric;

    public TwoWheelerVehical(String engine, String model, long price, boolean isElectric){
        super(engine, model, price);
        this.isElectric = isElectric;
    }

    @Override
    protected TwoWheelerVehical clone() throws CloneNotSupportedException {
        return (TwoWheelerVehical)super.clone();
    }

}

