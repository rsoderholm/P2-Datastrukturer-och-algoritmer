package p2;


import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by Robin on 2016-09-22.
 */
public class HashTable {
    private LinkedList<Object> insertionOrder = new LinkedList<>();
    private LinkedList<Entry>[] table;
    private Object key, value;


    public HashTable(int size) {
        table = (LinkedList<Entry>[]) new LinkedList<?>[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<>();
        }

    }

    /**
     * Generates and returns hashindex value
     * @param key
     * @return
     */
    private int hashIndex(Object key) {
        int hashCode = key.hashCode();
        hashCode = hashCode % table.length;
        return (hashCode < 0) ? -hashCode : hashCode;
    }

    /**
     * Gets value from key
     * @param key
     * @return
     */
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
        return insertionOrder.size();


    }

    /**
     * Adds a new entry to the hashtable if the key is not already in it. Adds 'value' last in the linkedlist
     * 'insertionOrder'
     *
     * @param key
     * @param value
     */
    public void put(Object key, Object value) {
        if (get(key) == null) {
            table[hashIndex(key)].addFirst(new Entry(key, value));
            insertionOrder.addFirst(value);


        }


    }

    /**
     * First I create a linkedlist and an iterator.
     * Removes the key if entr has the same  value as key.
     *
     * @param key
     */
    public void remove(Object key) {
        int hashIndex = hashIndex(key);

        LinkedList<Entry> entry = table[hashIndex];
        Iterator<Entry> iterator = entry.listIterator();

        while (iterator.hasNext()) {
            Entry entr = iterator.next();
            if (entr.equals(key)) {
                insertionOrder.remove(entr.getValue());
                iterator.remove();
            }
        }
    }

    /**
     * Returns the linkedlist insertionOrder
     *
     * @return
     */
    public LinkedList<Object> getInsertionOrder() {

        return insertionOrder;
    }


}
