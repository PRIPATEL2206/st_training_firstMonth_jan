package testTemplate;

class MyTemplate<T extends Number> {
    private T value;

    public MyTemplate(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public double square() {
        return value.doubleValue() * value.doubleValue();
    }
}
