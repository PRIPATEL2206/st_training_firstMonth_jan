package shapeHierachy;

import java.util.ArrayList;
import java.util.List;

class Drawing {
    private List<Shape> shapes;

    public Drawing() {
        this.shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void drawShapes() {
        System.out.println("Drawing all shapes in the collection:");
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
