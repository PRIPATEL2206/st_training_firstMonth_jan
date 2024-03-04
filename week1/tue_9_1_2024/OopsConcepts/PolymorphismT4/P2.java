package OopsConcepts.PolymorphismT4;

public class P2 {

}

interface Shape {
    float calculateArea();
}

class Circle implements Shape {
    float r;

    Circle(float r) {
        this.r = r;
    }

    @Override
    public float calculateArea() {
        return 22 / 7 * r * r;
    }

}

class Rectangle implements Shape {
    float l;
    float b;

    Rectangle(float l,float b) {
        this.l = l;
        this.b = b;
    }

    @Override
    public float calculateArea() {
        return l*b;
    }

}