package com.hanghe.practice.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
*
* 조규현과 백승환은 터렛에 근무하는 직원이다. 하지만 워낙 존재감이 없어서 인구수는 차지하지 않는다. 다음은 조규현과 백승환의 사진이다.
* 이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다. 조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.
* 조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고, 조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때,
* 류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.
*
* */
public class Baek_1002 {
    public static int solution(int x1,int x2, int y1, int y2, int r1, int r2) {
        int route = (int)(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        if(x1 == x2 && y1 == y2 && r1 == r2) { // 같은 위치에 같은 거리.
            return -1;
        } else if(route > Math.pow(r1 + r2,2) || route < Math.pow(r1 - r2,2)) { // 두원의 중첩 지점 x
            return 0;
        } else if(route == Math.pow(r1 + r2,2) || route == Math.pow(r1 - r2,2)) { // 외접, 내접
            return 1;
        } else {
            return 2;
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int x1,x2,y1,y2,r1,r2;
        while(T > 0) {
            st = new StringTokenizer(br.readLine());
            x1 = Integer.parseInt(st.nextToken());
            y1 = Integer.parseInt(st.nextToken());
            r1 = Integer.parseInt(st.nextToken());
            x2 = Integer.parseInt(st.nextToken());
            y2 = Integer.parseInt(st.nextToken());
            r2 = Integer.parseInt(st.nextToken());

            sb.append(solution(x1,x2,y1,y2,r1,r2));
            if(T != 1) sb.append("\n");
            T--;
        }
        System.out.println(sb);
    }
}
