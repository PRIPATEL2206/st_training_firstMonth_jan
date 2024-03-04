package trDBlikeFile;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Represents a transactional file system with indexing and querying features
class TransactionalFileSystemWithDatabase {

    private final Map<String, String> fileData = new HashMap<>();
    private final Map<String, String> index = new HashMap<>();
    private final ReadWriteLock lock = new ReentrantReadWriteLock();

    // Transactional method for writing data to the file system
    public void write(String fileName, String content) {
        lock.writeLock().lock();
        try {
            fileData.put(fileName, content);

            // Update index (simplified: indexing based on words in content)
            String[] words = content.split("\\s+");
            for (String word : words) {
                index.put(word, fileName);
            }
        } finally {
            lock.writeLock().unlock();
        }
    }

    // Transactional method for reading data from the file system
    public String read(String fileName) {
        lock.readLock().lock();
        try {
            return fileData.get(fileName);
        } finally {
            lock.readLock().unlock();
        }
    }

    // Query method to find files containing a specific word
    public String query(String word) {
        lock.readLock().lock();
        try {
            return index.get(word);
        } finally {
            lock.readLock().unlock();
        }
    }

    // Transactional method for deleting data from the file system
    public void delete(String fileName) {
        lock.writeLock().lock();
        try {
            fileData.remove(fileName);

            // Update index (simplified: remove entries related to the deleted file)
            index.values().removeIf(value -> value.equals(fileName));
        } finally {
            lock.writeLock().unlock();
        }
    }
}
