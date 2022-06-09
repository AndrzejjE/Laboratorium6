package Zad6_2;


import java.util.HashSet;

public class HashSet_Demo {
    public static void main(String[] args){
        HashSet<String> s = new HashSet<>();
        s.add("First");
        s.add("Second");
        s.add("Third");
        s.add("Fourth");
        System.out.print("HashSet: ");
        for (String string : s) {
            System.out.print(string + ", ");
        }
        System.out.print("\nArray: ");
        //String[] ss = s.toArray(new String[0]);
        Object[] ss = s.toArray();
        for (Object string : ss) {
            System.out.print(string + ", ");
        }





    }
}
