package com.apu.app;

public class Main {
    public static void main(String[] args) {
        System.out.println(expand(123, 3));
    }

    static String expand(int nr, int n) {
        String s = "";
        int pow = 1;
        for(int i = 1; i < n; i++) pow *= 10;
        for(int i = n; i >= 1; i--){
            int selected = nr / pow;
            s += selected + "*" + pow + " + ";
            nr = nr % pow; // remainder
            pow /= 10;
        }
        s = s.substring(0, s.length() - 5) + "[]";
        return s;
    }
}