package com.hanghe.practice.sample;

import java.text.SimpleDateFormat;

public class TestTemp {
    public static int timeCheck(int a) {
        // 결과값 받기 위한 데이터 생성.
        int result = 0;
        // 시작 시간
        long start = System.currentTimeMillis();
        System.out.println("start : " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(start));

        // 실제 알고리즘
//        result = Solution(a);

        // 끝난 시간.
        long end = System.currentTimeMillis();
        System.out.println("시간복잡도는 : " + (end - start) / 1000.0 + "ms");
        return result;
    }

    public static int memoryCheck(int a) {
        // 결과값 받기 위한 데이터 생성.
        int result = 0;

        // Garbage Collection으로 메모리 초기화
        System.gc();
        // 실행전 메모리 사용량 조회
        long before = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("샐행전 메모리 (MB) : " + before);

        // 실제 알고리즘
//        result = Solution(a);

        // Garbage Collection으로 메모리 정리
        System.gc();
        // 실행 후 메모리 사용량 조회
        long after  = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        // 메모리 사용량 측정
        long usedMemory = (after - before) / 1024;
        System.out.println("사용 중 인 메모리(MB) : " + usedMemory);

        return result;
    }
}
