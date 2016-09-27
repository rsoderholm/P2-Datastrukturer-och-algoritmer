package p2;

import javafx.beans.property.adapter.JavaBeanObjectProperty;
import jdk.nashorn.internal.scripts.JO;

import javax.print.attribute.HashAttributeSet;
import javax.swing.*;

/**
 * Created by Robin on 2016-09-22.
 */
public class Controller {
    private Object key, value;
    HashTable table = new HashTable(15);

    public void translateWord(String swedishWord) {

    }

    public void addWord(String addSwedishWord, String addEnglishWord) {
        addSwedishWord = JOptionPane.showInputDialog("Enter the swedish word you would like to add");
        addEnglishWord = JOptionPane.showInputDialog("Enter the english word you would like to add");
        table.put(addSwedishWord, addEnglishWord);


    }

    public void removeWord(String removeWord) {
        removeWord = JOptionPane.showInputDialog("Enter the swedish word to have it removed");
        table.remove(removeWord);

    }

    /**
     * Bara lite testande såhär långt
     *
     * @param args
     */
    public static void main(String[] args) {
        HashTable table = new HashTable(15);
        table.put("Hej", "Hello");
        table.put("Hejdå", "Goodbye");
        table.put("Tio", "Ten");
        String sweInput = JOptionPane.showInputDialog("Please enter a swedish word");
        String engInput = JOptionPane.showInputDialog("Please enter its english equivalent");
        table.put(sweInput, engInput);
        String enteredKey = JOptionPane.showInputDialog("Which word would you like to find the english word for?");
        JOptionPane.showMessageDialog(null, "The word your looking for is: " + table.get(enteredKey));
        String remove = JOptionPane.showInputDialog(null, "Please enter the key you would like to remove");


    }
}
