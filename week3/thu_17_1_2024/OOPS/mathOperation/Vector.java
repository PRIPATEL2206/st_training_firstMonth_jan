package mathOperation;

import java.util.Arrays;

// Vector class representing a mathematical vector
class Vector {
    private final double[] elements;

    public Vector(double... elements) {
        this.elements = elements;
    }

    public Vector add(Vector other) {
        double[] result = new double[elements.length];
        for (int i = 0; i < elements.length; i++) {
            result[i] = elements[i] + other.elements[i];
        }
        return new Vector(result);
    }

    public Vector subtract(Vector other) {
        double[] result = new double[elements.length];
        for (int i = 0; i < elements.length; i++) {
            result[i] = elements[i] - other.elements[i];
        }
        return new Vector(result);
    }

    public Vector multiply(double scalar) {
        double[] result = new double[elements.length];
        for (int i = 0; i < elements.length; i++) {
            result[i] = elements[i] * scalar;
        }
        return new Vector(result);
    }

    public double dotProduct(Vector other) {
        double result = 0;
        for (int i = 0; i < elements.length; i++) {
            result += elements[i] * other.elements[i];
        }
        return result;
    }

    public double[] getElements() {
        return elements;
    }

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }
}
