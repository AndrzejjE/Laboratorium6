package Zad6_1;

import java.util.LinkedList;

public class FirstLast {
    public static void main(String[] args){
        LinkedList<String> s = new LinkedList<>();

        s.add("Red");
        s.add("Green");
        s.add("Black");
        s.add("Pink");
        s.add("Orange");
        System.out.print("The Original linked list: ");
        for (String string : s) {
            System.out.print(string + ", ");
        }
        System.out.println("\nElement removed: " + s.removeFirst());
        System.out.println("Element removed: " + s.removeLast());

        System.out.print("The New linked list: ");
        for (String string : s) {
            System.out.print(string + ", ");
        }
    }
}
