package lambda;

import java.util.function.Predicate;

public class lambdasInMetaprograme {

    static class GenericConstraint<T> {
        private Predicate<T> constraint;

        public GenericConstraint(Predicate<T> constraint) {
            this.constraint = constraint;
        }

        public boolean isValid(T value) {
            return constraint.test(value);
        }
    }

    public static void main(String[] args) {
        GenericConstraint<String> stringLengthConstraint = new GenericConstraint<>(str -> str.length() > 5);
        System.out.println("Test 'Hello': " + stringLengthConstraint.isValid("Hello"));
        System.out.println("Test 'HelloWorld': " + stringLengthConstraint.isValid("HelloWorld"));

        GenericConstraint<Integer> isPositiveConstraint = new GenericConstraint<>(num -> num > 0);
        System.out.println("Test 10: " + isPositiveConstraint.isValid(10));
        System.out.println("Test -5: " + isPositiveConstraint.isValid(-5));
    }
}

