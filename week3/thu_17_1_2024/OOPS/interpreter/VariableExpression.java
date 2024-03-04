package interpreter;

// Terminal Expression class for representing a variable
class VariableExpression implements Expression {
    private String variable;

    public VariableExpression(String variable) {
        this.variable = variable;
    }

    @Override
    public int interpret(Context context) {
        return context.getVariableValue(variable);
    }
}
