package OopsConcepts.InheritanceT3;

class Shape {
    float area() {
        return 0;
    }

    float perimeter() {
        return 0;
    }
}

class Rectangle extends Shape {
    float l;
    float b;

    Rectangle(float l, float b) {
        this.l = l;
        this.b = b;
    }

    @Override
    float area() {
        return l * b;
    }

    @Override
    float perimeter() {
        return 2 * (l + b);
    }

}

class Circle extends Shape {
    float r;

    Circle(float r) {
        this.r = r;
    }

    @Override
    float area() {
        return 22 / 7 * r * r;
    }

    @Override
    float perimeter() {
        return 2 * 22 / 7 * r;
    }
}