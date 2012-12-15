package junit.tutorial;

import java.util.HashMap;
import java.util.Map;

public class ItemStock {

    private Map<String, Integer> items = new HashMap<String, Integer>();

    public int size(String item) {
        Integer size = items.get(item);
        return size == null ? 0 : size;
    }

    public boolean contains(String item) {
        return items.containsKey(item);
    }

    public void add(String item, int size) {
        items.put(item, size);
    }

}
