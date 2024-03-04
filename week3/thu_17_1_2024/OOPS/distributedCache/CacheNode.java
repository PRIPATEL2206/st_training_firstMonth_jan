package distributedCache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class CacheNode {
    private Map<String, String> localCache = new ConcurrentHashMap<>();
    private static CacheNode instance = new CacheNode();

    private CacheNode() {
    }

    public static CacheNode getInstance() {
        return instance;
    }

    public void put(String key, String value) {
        localCache.put(key, value);
        CacheNetwork.notifyUpdate(key, value);
    }

    public String get(String key) {
        return localCache.getOrDefault(key, null);
    }

    public void updateFromNetwork(String key, String value) {
        localCache.put(key, value);
    }
}
