package interpreter;


// Client code
public class InterpreterExample {
    public static void main(String[] args) {
        // Define the expression: x + (y - 2)
        Expression expression = new AddExpression(
                new VariableExpression("x"),
                new SubtractExpression(
                        new VariableExpression("y"),
                        new ConstantExpression(2)
                )
        );

        // Set variable values
        Context context = new Context();
        context.setVariable("x", 5);
        context.setVariable("y", 8);

        // Interpret the expression
        int result = expression.interpret(context);
        System.out.println("Result: " + result);
    }
}

