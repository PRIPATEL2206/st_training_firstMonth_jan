package bridge;

public class Main {
    public static void main(String[] args) {

        Color red = new Red();
        Color blue = new Blue();

        Shape square = new Square(red);
        System.out.println(square.draw());

        square = new Square(blue);
        System.out.println(square.draw());
    }
}
