package OopsConcepts.MethodOverloadingT7;

public class P2 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.add(5, 7));
        System.out.println(c1.add(20, 7,9));
    }
}

class Calculator {
    float add(float a, float b) {
        return a + b;
    }

    float add(float a, float b, float c) {
        return a + b + c;
    }
}