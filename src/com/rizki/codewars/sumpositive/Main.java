package com.rizki.codewars.sumpositive;

public class Main {
    public static void main(String[] args) {


        System.out.println(Positive.sum(new int[] {1,2,3,4,5} ));
        System.out.println(Positive.sum(new int[] {1,-2,3,4,5} ));
        System.out.println(Positive.sum(new int[] {} ));
        System.out.println(Positive.sum(new int[] {-1,-2,-3,-4,-5} ));
        System.out.println(Positive.sum(new int[] {-1,2,3,4,-5} ));
    }
}
