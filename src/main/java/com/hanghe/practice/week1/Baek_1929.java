package com.hanghe.practice.week1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
*
* M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
*
*/
public class Baek_1929 {
    public static boolean isPrime(int num){
        if(num<2)
            return false;

        for(int i=2; i*i<=num; i++){  //
            if(num% i == 0)
                return false;
        }
        return true;

    }

    public static void main(String[] ars) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken()), N = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[N];
        int prime_cnt = 0;
        for(int i=M; i<=N; i++) {
            if(isPrime(i))
                sb.append(i + "\n");
        }
        System.out.println(sb);
    }
}
