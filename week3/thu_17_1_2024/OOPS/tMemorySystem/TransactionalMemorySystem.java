package tMemorySystem;

import java.util.HashMap;
import java.util.Map;

// TransactionalMemorySystem manages transactions and provides transactional operations
class TransactionalMemorySystem {

    private Map<String, Object> memory = new HashMap<>();
    private Map<String, Object> transactionSnapshot;

    // Start a new transaction
    public void beginTransaction() {
        transactionSnapshot = new HashMap<>(memory);
    }

    // Commit the current transaction
    public void commitTransaction() {
        memory = new HashMap<>(transactionSnapshot);
        transactionSnapshot = null;
    }

    // Rollback the current transaction
    public void rollbackTransaction() {
        transactionSnapshot = null;
    }

    // Read operation within a transaction
    public Object read(String key) {
        if (transactionSnapshot != null && transactionSnapshot.containsKey(key)) {
            return transactionSnapshot.get(key);
        } else {
            return memory.get(key);
        }
    }

    // Write operation within a transaction
    public void write(String key, Object value) {
        if (transactionSnapshot != null) {
            transactionSnapshot.put(key, value);
        } else {
            memory.put(key, value);
        }
    }
}
