package com.hanghe.practice.week1;

import java.util.Scanner;

public class Baek_1110 {
    public static void main(String[] ars) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int cycle = 0;
        if(a == 0) {
            cycle = 1;
        }
        int start = a;
        int result = 0;
        boolean b = false;
        while(result != a) {
            if(start < 10) {
                b = true;
                start *= 10;
            }
            result = (start / 10) + (start % 10);
            if(b) {
                result = ((start/ 10) % 10) * 10 + (result % 10);
            } else {
                result = (start % 10) * 10 + (result % 10);
            }
            b = false;
            cycle++;
            start = result;
        }
        System.out.println(cycle);

    }
}
