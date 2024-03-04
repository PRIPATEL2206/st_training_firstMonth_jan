package testTemplate;

public class TestTemplate {
    public static void main(String[] args) {
        MyTemplate<Integer> intTemplate = new MyTemplate<>(5);
        System.out.println("Square of integer: " + intTemplate.square());

        // Compilation error since String is not a subclass of Number
//         MyTemplate<String> stringTemplate = new MyTemplate<>("Hello");
    }
}