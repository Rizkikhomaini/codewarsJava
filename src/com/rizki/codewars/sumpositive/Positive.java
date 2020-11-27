package com.rizki.codewars.sumpositive;

public class Positive {

    public static int sum(int[] arr){

        int total = 0;
        for (int i : arr) {
            if (i > 0) {
                total += i;
            }
        }
        return total;
    }

}
