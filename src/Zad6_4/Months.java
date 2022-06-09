package Zad6_4;

import java.util.HashMap;
import java.util.Scanner;

public class Months {
    public static void main(String[] args){

        HashMap<Integer, String> month = new HashMap<>();
        month.put(1,"January");
        month.put(2,"February");
        month.put(3,"March");
        month.put(4,"April");
        month.put(5,"May");
        month.put(6,"June");
        month.put(7,"July");
        month.put(8,"August");
        month.put(9,"September");
        month.put(10,"October");
        month.put(11,"November");
        month.put(12,"December");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any number from 1 to 12: ");
        int num = scan.nextInt();

        if (num > 12 || num < 1) {
            System.out.println("You enter the wrong number");
        }else System.out.println("You chose: " + num);

        System.out.println("Which month has a number " + num + "?");
        System.out.println("This is " + month.get(num));

        System.out.println("All months: " + month);

    }
}
