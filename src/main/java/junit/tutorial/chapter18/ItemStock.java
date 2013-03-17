package junit.tutorial.chapter18;

import java.util.HashMap;
import java.util.Map;

public class ItemStock {

    private Map<String, Integer> items = new HashMap<String, Integer>();

    public int getNum(Item item) {
        Integer count = items.get(item.getName());
        if (count == null) {
            count = 0;
        }
        return count;
    }

    public void add(Item item) {
        Integer count = items.get(item.getName());
        if (count == null) {
            count = 0;
        }
        items.put(item.getName(), count + 1);
    }

}
