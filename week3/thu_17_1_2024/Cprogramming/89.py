from qiskit import QuantumCircuit, Aer, transpile, assemble, execute

def quantum_walk(num_steps):
    
    n = num_steps * 2 + 1

    
    qc = QuantumCircuit(n)

    
    qc.h(0)

    
    for step in range(num_steps):
        
        for i in range(1, n):
            qc.cx(0, i)  
            qc.x(i)      

        
        qc.h(0)

    
    qc.measure_all()

    
    backend = Aer.get_backend('qasm_simulator')
    compiled_circuit = transpile(qc, backend)
    qobj = assemble(compiled_circuit)
    result = execute(qc, backend).result()
    counts = result.get_counts()

    print("Measurement results:", counts)


num_steps = 3
quantum_walk(num_steps)
