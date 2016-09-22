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

    public int count() {
        return 0;

    }

    public void put(Object key, Object value) {


    }

    public void remove(Object key) {
        
    }

    public LinkedList<Object> getInsertionOrder() {
        return null;
    }


}
