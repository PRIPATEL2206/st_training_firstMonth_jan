package rtti;

class MyClass {
    private String privateField;

    public MyClass(String privateField) {
        this.privateField = privateField;
    }

    public void publicMethod() {
        System.out.println("Public method called.");
    }

    private void privateMethod(String message) {
        System.out.println("Private method called with message: " + message);
    }

    public String getPrivateField() {
        return privateField;
    }

    public void setPrivateField(String privateField) {
        this.privateField = privateField;
    }
}
