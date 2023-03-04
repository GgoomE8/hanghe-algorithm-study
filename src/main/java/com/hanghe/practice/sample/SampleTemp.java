package com.hanghe.practice.sample;

public class SampleTemp {
    public static String Solution(int a) {
        String text = "Algorithm 주차에 오신것을 환영합니다.";
        return a + "기 여러분 " + text;
    }

    public static void main(String[] args) {
        System.out.println(Solution(14));
    }
}
