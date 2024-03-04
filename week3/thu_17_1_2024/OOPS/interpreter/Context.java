package interpreter;

import java.util.HashMap;
import java.util.Map;

// Context class contains information that the interpreter uses while interpreting
class Context {
    private Map<String, Integer> variables = new HashMap<>();

    public void setVariable(String variable, int value) {
        variables.put(variable, value);
    }

    public int getVariableValue(String variable) {
        return variables.getOrDefault(variable, 0);
    }
}
