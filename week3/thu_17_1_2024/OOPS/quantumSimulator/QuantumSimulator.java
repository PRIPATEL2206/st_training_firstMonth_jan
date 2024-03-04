package quantumSimulator;

import java.util.ArrayList;
import java.util.List;

class Complex {
    double real;
    double imaginary;

    Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }


    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }


    Complex multiply(Complex other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(realPart, imaginaryPart);
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}

interface QuantumGate {
    Complex[][] getMatrix();
    Complex[] applyTo(Complex[] state);
}

class HadamardGate implements QuantumGate {
    private static final Complex[][] matrix = {
        {new Complex(1 / Math.sqrt(2), 0), new Complex(1 / Math.sqrt(2), 0)},
        {new Complex(1 / Math.sqrt(2), 0), new Complex(-1 / Math.sqrt(2), 0)}
    };

    public Complex[][] getMatrix() {
        return matrix;
    }

    public Complex[] applyTo(Complex[] state) {
        Complex[] result = new Complex[state.length];
        for (int i = 0; i < matrix.length; i++) {
            result[i] = new Complex(0, 0);
            for (int j = 0; j < state.length; j++) {
                result[i] = result[i].add(matrix[i][j].multiply(state[j]));
            }
        }
        return result;
    }
}

class Qubit {
    Complex[] state;

    Qubit() {
        state = new Complex[]{new Complex(1, 0), new Complex(0, 0)};
    }

    void applyGate(QuantumGate gate) {
        state = gate.applyTo(state);
    }

    Complex[] getState() {
        return state;
    }
}

class QuantumCircuit {
    List<QuantumGate> gates;

    QuantumCircuit() {
        gates = new ArrayList<>();
    }

    void addGate(QuantumGate gate) {
        gates.add(gate);
    }

    void execute(Qubit qubit) {
        for (QuantumGate gate : gates) {
            qubit.applyGate(gate);
        }
    }
}

public class QuantumSimulator {
    public static void main(String[] args) {
        Qubit qubit = new Qubit();
        QuantumCircuit circuit = new QuantumCircuit();
        circuit.addGate(new HadamardGate());

        circuit.execute(qubit);

        Complex[] finalState = qubit.getState();
        System.out.println("Final State of Qubit:");
        for (Complex c : finalState) {
            System.out.println(c);
        }
    }
}
