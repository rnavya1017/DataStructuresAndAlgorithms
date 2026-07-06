

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Custom HashMap using LinkedHashMap
 */
public class HashMap<K, V> {

    private LinkedHashMap<K, V> map = new LinkedHashMap<>();

    // Add or Update
    public void add(K key, V value) {
        map.put(key, value);
    }

    // Get value
    public V get(K key) {
        return map.get(key);
    }

      // Remove key
    public void remove(K key) {
        map.remove(key);
    }

    // Display all key-value pairs
    public void display() {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}