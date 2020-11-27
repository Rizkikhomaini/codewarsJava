package com.rizki.codewars.returnnegative;

import static java.lang.Math.abs;

public class Kata {

    public static int makeNegative(final int x) {

//        if (x < 0) {
//            return x;
//        } else {
//            return -x;
//        }

        return -abs(x);

    }

    public static void main(String[] args) {
        System.out.println(Kata.makeNegative(42));
        System.out.println(Kata.makeNegative(-42));
        System.out.println(Kata.makeNegative(0));
    }
}
