package com.rizki.codewars;

public class Alarm {

    public static boolean setAlarm (boolean employee, boolean vacation) {

        boolean alarm = false;

        if (employee && !vacation) {
            alarm = true;
        }

        return alarm;
    }

    public static void main(String[] args) {
        System.out.println(setAlarm(true, true));
        System.out.println(setAlarm(false, true));
        System.out.println(setAlarm(false, false));
        System.out.println(setAlarm(true, false));
    }
}
