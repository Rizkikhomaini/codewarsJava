package com.rizki.codewars.removespacestring;

public class Kata {

    static String noSpace(final String x) {
        return x.replaceAll(" ", "");
    }

    public static void main(String[] args) {
        System.out.println(Kata.noSpace("8 j 8   mBliB8g  imjB8B8  jl  B"));
        System.out.println(Kata.noSpace("8 8 Bi fk8h B 8 BB8B B B  B888 c hl8 BhB fd"));
        System.out.println(Kata.noSpace("8aaaaa dddd r     "));
        System.out.println(Kata.noSpace("jfBm  gk lf8hg  88lbe8 "));
        System.out.println(Kata.noSpace("8j aam"));
    }
}
