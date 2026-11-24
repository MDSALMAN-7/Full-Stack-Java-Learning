package com.collection.ArrayList;
import java.util.ArrayList;
public class SecondLargestNumber2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(70);
        numbers.add(50);
        numbers.add(34);
        numbers.add(23);

        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        System.out.println(max);

        for (int i = 0; i < numbers.size(); i++) {

            int current = numbers.get(i);

            if (current > max) {

                max2 = max;
                max = current;

            } else if (current > max2 && current < max) {

                max2 = current;
            }
        }

        System.out.println("Largest Number: " + max);
        System.out.println("Second Largest Number: " + max2);
    }
}
