package com.sda.algorytmy;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        int tab[] = new int[20];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i < tab.length; i++) {
            tab[i] = tab[i - 1] + tab[i - 2];
            System.out.println(tab[i]);


        }
        System.out.println(fibbo(5));
        System.out.println(fibonacci2(5));
    }

    public static int fibbo(int a) {
        if (a <= 2) {
            return 1;
        } else {
            return fibbo(a - 2) + fibbo(a - 1);
        }
    }

    public static int fibonacci2(int a) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (N < 2) {
            return N;
        } else {
            int A = 0;
            int B = 1;
            int C = 1;
            int K = 2;

            for (K = 2; K < N; K++){

            A = B;
            B = C;
            C = A + B;
        }
        return C;
    }
}
}


