package lab1;

import java.util.HashSet;

public class HashSetDemo{
    public static void main(String[] args) {
        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.add(5);
        numberSet.add(10);
        numberSet.add(15);
        numberSet.add(20);
        numberSet.add(25);

        System.out.println("Elements in the HashSet: " + numberSet);

        int numberToCheck = 10;
        if (numberSet.contains(numberToCheck)) {
            System.out.println("HashSet contains " + numberToCheck);
        } else {
            System.out.println("HashSet does not contain " + numberToCheck);
        }

        int numberToRemove = 15;
        numberSet.remove(numberToRemove);
        System.out.println("Removed " + numberToRemove + " from the HashSet");

        System.out.println("Size of the HashSet: " + numberSet.size());
    }
}
