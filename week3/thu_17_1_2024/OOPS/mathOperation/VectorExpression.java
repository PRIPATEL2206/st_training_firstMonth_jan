package mathOperation;

// Expression template representing the operation: (v1 + v2) * scalar
class VectorExpression {
    private final Vector v1;
    private final Vector v2;
    private final double scalar;

    public VectorExpression(Vector v1, Vector v2, double scalar) {
        this.v1 = v1;
        this.v2 = v2;
        this.scalar = scalar;
    }

    public Vector evaluate() {
        return v1.add(v2).multiply(scalar);
    }
}
