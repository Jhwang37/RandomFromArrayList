package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        ArrayList<Integer> randomInt = new ArrayList<Integer>();
        randomInt.add(3);
        randomInt.add(5);
        randomInt.add(9);
        randomInt.add(56);
        randomInt.add(88);
        randomInt.add(34);
        randomInt.add(73);
        randomInt.add(45);

        for (int x : randomInt) {
            System.out.println(x);
        }
        System.out.println("Random int: " + randomInt.get(rand.nextInt(randomInt.size())));
    }
}
