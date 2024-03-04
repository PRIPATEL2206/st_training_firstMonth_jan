package mathOperation;


public class TestMathsOperations {
    public static void main(String[] args) {
        Vector v1 = new Vector(1, 2, 3);
        Vector v2 = new Vector(4, 5, 6);
        double scalar = 2.0;

        // Using expression template to represent (v1 + v2) * scalar
        VectorExpression expression = new VectorExpression(v1, v2, scalar);
        Vector result = expression.evaluate();

        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);
        System.out.println("Scalar: " + scalar);
        System.out.println("(v1 + v2) * scalar: " + result);
    }
}
