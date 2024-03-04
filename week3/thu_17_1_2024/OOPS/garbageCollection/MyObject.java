package garbageCollection;

class MyObject {
    private String data;

    public MyObject(String data) {
        this.data = data;
    }

    public void setData(String data) {
        this.data = data;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object with data '" + data + "' is being garbage collected.");
        super.finalize();
    }
}
