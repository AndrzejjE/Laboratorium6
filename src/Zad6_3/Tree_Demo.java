package Zad6_3;

import java.util.Iterator;
import java.util.TreeSet;

public class Tree_Demo {
    public static void main(String[] args){
        TreeSet<String> tree1 = new TreeSet<>();
        tree1.add("Black");
        tree1.add("Green");
        tree1.add("Orange");
        tree1.add("Red");
        tree1.add("White");
        System.out.println("a) Drzewo zawierajace piec nazw kolorow:");
        System.out.println("tree1: " + tree1);

        Iterator<String> it1 = tree1.iterator();
        System.out.println("\nb) Iterowanie po wszystkich elementach drzewa:");
        while (it1.hasNext()){
            System.out.println(it1.next());
        }

        TreeSet<String> tree2 = new TreeSet<>();
        tree2.add("Black");
        tree2.add("Pink");
        tree2.add("White");
        System.out.println("\nc) Dodanie do istniejacego drzewa nowego drzewa binarnego:");
        System.out.println("tree1: " + tree1);
        System.out.println("tree2: " + tree2);
        tree1.addAll(tree2);
        System.out.println("tree1 po zsumowaniu z tree2: " + tree1);

        System.out.println("\nd) Wypisanie elementow drzewa w odwrotnej kolejnosci:");
        System.out.println("Orginalne drzewo tree1: " + tree1);
        System.out.println("Odwrotna kolejnosc:");

        Iterator it2 = tree1.descendingIterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }

        System.out.println("\ne)Wypisanie pierwszego i ostatniego elementu przechowywanego w drzewie:");
        System.out.println("tree1: " + tree1);
        System.out.println("Pierwszy element drzewa: " + tree1.first());
        System.out.println("Ostatni element drzewa: " + tree1.last());

        Object tree3 = tree1.clone();
        System.out.println("\nf) Sklonowanie drzewa binarnego do innego drzewa binarnego i wypisanie nowaego drzewa na ekran: ");
        System.out.println("tree1: " + tree1);
        System.out.println("Nowe drzewo tree3: " + tree3);

        System.out.println("\ng) Liczba elementow, przechowywanych w drzewie: ");
        System.out.println("tree1: " + tree1);
        System.out.println("Rozmiar tree1: " + tree1.size());
        System.out.println("\nh) Porownanie elementow przechowywanych w dwoch drzewach binarnych: ");
        for (String e : tree1) {
            System.out.println(tree2.contains(e));
        }
    }
}
