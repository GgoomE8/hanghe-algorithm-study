package com.hanghe.practice.sample;

public class MathTemp {
    public static int SolutionMath() {
        int result;
        float b = (float) (Math.random() * 1000 + Math.random());
        System.out.println(b);
        return result = (int) Math.round(b);
    }
    public static void main(String[] args) {
        System.out.println(SolutionMath());
    }
}
