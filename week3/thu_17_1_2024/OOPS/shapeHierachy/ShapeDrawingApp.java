package shapeHierachy;

public class ShapeDrawingApp {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(8.0, 4.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        Drawing drawing = new Drawing();

        drawing.addShape(circle);
        drawing.addShape(rectangle);
        drawing.addShape(triangle);

        drawing.drawShapes();
    }
}

