package junit.tutorial;

import java.util.HashMap;
import java.util.Map;

public class ItemStockImpl implements ItemStock {

    private Map<String, Integer> items = new HashMap<String, Integer>();

    /*
     * (non-Javadoc) {@inheritDoc}
     */
    @Override
    public void add(String item, int num) {
        items.put(item, num);
    }

    /*
     * (non-Javadoc) {@inheritDoc}
     */
    @Override
    public int size(String item) {
        Integer size = items.get(item);
        return size == null ? 0 : size;
    }

    /*
     * (non-Javadoc) {@inheritDoc}
     */
    @Override
    public boolean contains(String item) {
        return items.containsKey(item);
    }

}
