package p2;

import javax.swing.*;

/**
 * Created by Robin on 2016-09-22.
 */
public class Controller {
    private Object key, value;

    /**
     * Bara lite testande såhär långt
     * @param args
     */
    public static void main(String[] args) {
        HashTable ht = new HashTable(5);
        Object key = JOptionPane.showInputDialog("Enter key");
        Object value = JOptionPane.showInputDialog("Enter value");
        ht.put(key, value);
        System.out.println(key);
        Object key2 = JOptionPane.showInputDialog("What would you like to remove");
        ht.remove(key2);
        System.out.println(ht.count());


    }
}
