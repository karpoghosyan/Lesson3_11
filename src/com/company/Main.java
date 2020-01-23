package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        numbers1.add(5);
        numbers2.add(1);
        numbers2.add(2);
        numbers2.add(3);
        numbers2.add(4);
        numbers2.add(5);
        System.out.println(numbers1.equals(numbers2));
    }
}
