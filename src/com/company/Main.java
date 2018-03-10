package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        boolean r = check(a, b);
        System.out.println(r);
    }

    static boolean check(String a, String b) {
        char[] x = a.toCharArray();
        char[] y = b.toCharArray();
        int z = 0;
        for (int i = 0; i < a.length(); i++) {
            if (y[z] == x[i]) {
                z++;
                if (z == y.length - 1)
                    return true;
                continue;
            }
        }
        return false;
    }
}
