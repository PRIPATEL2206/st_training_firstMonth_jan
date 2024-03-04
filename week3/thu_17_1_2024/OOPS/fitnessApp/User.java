package fitnessApp;

// User class to represent a fitness user
class User {
    private String name;
    private int age;
    private double weight; // in kilograms

    public User(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }
}
