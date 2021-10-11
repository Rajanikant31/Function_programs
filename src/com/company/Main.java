package com.company;

public class Main {


        public static void main(String[] args) {
            int a, b, c , a1, a2, d;
            a = 6;
            b = 4;
            a1=10;
            a2=5;
            c = sum(a, b);
            d=sum(a1,a2);
            System.out.println(c);
            System.out.println(d);
        }

        public static int sum(int x, int y) {
            int z;
            if (x > y) {
                z = x + y;
            } else {
                z = x - y;
            }
            return z;
        }

    }