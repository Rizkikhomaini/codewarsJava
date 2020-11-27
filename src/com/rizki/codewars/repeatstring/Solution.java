package com.rizki.codewars.repeatstring;

public class Solution {

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder stringBuilder = new StringBuilder(string.length() * repeat);
        int i = 0;
        while (i < repeat) {
            stringBuilder.append(string);
            i++;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(Solution.repeatStr(4, "a"));
        System.out.println(Solution.repeatStr(3, "Hello"));
        System.out.println(Solution.repeatStr(5, ""));
        System.out.println(Solution.repeatStr(0, "kata"));
    }
}
