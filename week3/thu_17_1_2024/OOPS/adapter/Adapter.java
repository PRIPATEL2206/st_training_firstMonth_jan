package adapter;//Example for adapter pattern

class Adapter extends Adaptee implements Traget{

    @Override
    public void request() {
        specificRequest();
    }

}