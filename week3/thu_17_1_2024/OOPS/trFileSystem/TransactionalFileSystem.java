package trFileSystem;

import java.util.HashMap;
import java.util.Map;

class TransactionalFileSystem {

    private Map<String, TransactionalFile> fileSystem = new HashMap<>();
    private Map<Long, Transaction> transactions = new HashMap<>();
    private long transactionIdCounter = 0;

    public long beginTransaction() {
        long transactionId = ++transactionIdCounter;
        transactions.put(transactionId, new Transaction());
        return transactionId;
    }

    public void commitTransaction(long transactionId) {
        Transaction transaction = transactions.get(transactionId);
        if (transaction != null) {
            for (TransactionalFile file : transaction.getFiles()) {
                file.commit();
            }
            transactions.remove(transactionId);
        }
    }

    public void rollbackTransaction(long transactionId) {
        Transaction transaction = transactions.get(transactionId);
        if (transaction != null) {
            for (TransactionalFile file : transaction.getFiles()) {
                file.rollback();
            }
            transactions.remove(transactionId);
        }
    }

    public TransactionalFile createFile(String path, String content) {
        TransactionalFile file = new TransactionalFile(path, content);
        fileSystem.put(path, file);
        return file;
    }

    public TransactionalFile getFile(String path) {
        return fileSystem.get(path);
    }

    public static class Transaction {
        private final Map<String, TransactionalFile> filesInTransaction = new HashMap<>();

        public void addFile(TransactionalFile file) {
            filesInTransaction.put(file.getPath(), file);
        }

        public Iterable<TransactionalFile> getFiles() {
            return filesInTransaction.values();
        }
    }

    public class TransactionalFile {
        private final String path;
        private String content;
        private String contentBackup;

        public TransactionalFile(String path, String content) {
            this.path = path;
            this.content = content;
        }

        public String getPath() {
            return path;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public void commit() {
            contentBackup = null;
        }

        public void rollback() {
            if (contentBackup != null) {
                content = contentBackup;
                contentBackup = null;
            }
        }

        public void beginTransaction(long transactionId) {
            Transaction transaction = transactions.get(transactionId);
            if (transaction != null) {
                transaction.addFile(this);
                contentBackup = content;
            }
        }
    }
}
