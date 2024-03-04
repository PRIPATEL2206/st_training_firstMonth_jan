from qiskit import QuantumCircuit, Aer, transpile, assemble, execute

def buhrman_miltersen_algorithm(input_list):
    n = len(input_list)
    num_qubits = n.bit_length()

    
    required_qubits = 2 * n
    if num_qubits < required_qubits:
        num_qubits = required_qubits

    
    qc = QuantumCircuit(num_qubits, num_qubits)

    
    qc.h(range(num_qubits))

    
    for i in range(n):
        qc.cx(i, i + n)

    
    qc.h(range(num_qubits))

    
    qc.measure(range(n), range(n))

    
    backend = Aer.get_backend('qasm_simulator')
    compiled_circuit = transpile(qc, backend)
    qobj = assemble(compiled_circuit)
    result = execute(qc, backend).result()
    counts = result.get_counts()

    
    print("Measurement results:", counts)


input_list = [1, 2, 3, 4, 5, 6, 7, 8, 9, 1]
buhrman_miltersen_algorithm(input_list)
