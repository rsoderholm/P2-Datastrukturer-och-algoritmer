package p2;

import sun.awt.image.ImageWatched;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Robin on 2016-09-22.
 */
public class HashTable {
    private LinkedList<Object> insertionOrder = new LinkedList<Object>();
    private LinkedList<Entry>[] table;

    public HashTable(int size) {
        table = (LinkedList<Entry>[]) new LinkedList<?>[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<Entry>();
        }

    }

    private int hashIndex(Object key) {
        int hashCode = key.hashCode();
        hashCode = hashCode % table.length;
        return (hashCode < 0) ? -hashCode : hashCode;
    }

    public Object get(Object key) {
        int hashIndex = hashIndex(key);
        LinkedList<Entry> entries = table[hashIndex];
        Iterator<Entry> it = entries.listIterator();

        while (it.hasNext()) {
            Entry entry = it.next();
            if (entry.equals(key)) {
                return entry.getValue();
            }

        }
        return null;
    }

    /**
     * Returns number of elements in the hashtable by calling insertionOrder.count
     *
     * @return
     */
    public int count() {
        return 0;

    }

    /**
     * Adds a new entry to the hashtable if the key is not already in it. Adds 'value' last in the linkedlist
     * 'insertionOrder'
     *
     * @param key
     * @param value
     */
    public void put(Object key, Object value) {


    }

    /**
     * Removes an entry from the hashtable if the key is found. If the key is found, removes value from the linkedlist
     * insertionOrder
     *
     * @param key
     */
    public void remove(Object key) {

    }

    /**
     * Returns the linkedlist insertionOrder
     *
     * @return
     */
    public LinkedList<Object> getInsertionOrder() {
        return null;
    }


}
