package garbageCollection;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollectionExample {

    public static void main(String[] args) {
        List<MyObject> objectList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            MyObject obj = new MyObject("Object-" + i);
            objectList.add(obj);
        }
        objectList.subList(1, 3).clear();
        System.gc();
    }
}

