package p2;

/**
 * Created by Robin on 2016-09-29.
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Dictionary {

    Scanner scanner = new Scanner(System.in);
    private String textstring;
    private String scantext;
    HashTable hashtable = new HashTable(15);
    private Object key;


    public String scanText() {
        scantext = scanner.nextLine();
        return scantext;
    }

    public void dictionaryMenu() {
        System.out.println("1. Translate word");
        System.out.println("2. Add word");
        System.out.println("3. Remove word ");
        System.out.println("4. Print dictionary");
        System.out.println("5. Exit program");
        System.out.println("Select: ");
        switch (scanText()) {
            case "1":
                wordTranslator();
                dictionaryMenu();
                break;
            case "2":
                addWord();
                dictionaryMenu();
                break;
            case "3":
                removeWord();
                dictionaryMenu();
                break;
            case "4":
                printDictionary();
                dictionaryMenu();
                break;

            case "5":
                System.exit(0);
                dictionaryMenu();
            default:
                break;
        }
    }

    public void wordTranslator() {
        System.out.println("Which word would you like to translate into english?");
        String inString = scanText();

        String[] term = new String[15];
        String[] array = inString.split(" ");
        String word = "";

        for (String s : array) {
            word += (hashtable.get(s) + " ");
        }


        System.out.println("The english translation for the word is: ");
        System.out.println(word);
    }

    public void addWord() {
        System.out.println("Type the swedish word.");
        String swedish = scanText();
        System.out.println("Type the english word.");
        String english = scanText();
        hashtable.put(swedish, english);
    }

    public void removeWord() {
        System.out.println("Type the swedish word that you would like to remove from the dictionary.");
        String removeEntry = scanText();
        key = removeEntry;
        hashtable.remove(key);
        System.out.println("The word has been removed.");
    }

    public void printDictionary() {
        System.out.println("Words in this dictionary are: ");
        LinkedList<Object> entrySet = hashtable.getInsertionOrder();
        Iterator<Object> iter = entrySet.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());

        }
    }

    public static void main(String[] args) {

        Dictionary dictionary = new Dictionary();
        HashTable table = new HashTable(15);
        dictionary.hashtable.put("hej", "hello");
        dictionary.hashtable.put("tack", "thanks");
        dictionary.hashtable.put("nu", "now");
        dictionary.hashtable.put("imorgon", "tomorrow");
        dictionary.hashtable.put("te", "tea");
        dictionary.hashtable.put("kaffe", "coffee");

        dictionary.dictionaryMenu();
    }
}