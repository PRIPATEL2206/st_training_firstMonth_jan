package distributedCache;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class distributedCacheSystem {

    public static void main(String[] args) {
        CacheNode node1 = CacheNode.getInstance();
        CacheNode node2 = CacheNode.getInstance();

        CacheNetwork.registerNode(node1);
        CacheNetwork.registerNode(node2);

        node1.put("key1", "value1");
        System.out.println("Node 2 retrieves key1: " + node2.get("key1"));
    }
}
