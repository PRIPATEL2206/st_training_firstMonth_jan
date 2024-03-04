package distributedCache;

import java.util.ArrayList;
import java.util.List;

class CacheNetwork {
    private static List<CacheNode> nodes = new ArrayList<>();

    public static void registerNode(CacheNode node) {
        nodes.add(node);
    }

    public static void notifyUpdate(String key, String value) {
        for (CacheNode node : nodes) {
            node.updateFromNetwork(key, value);
        }
    }
}
