package com.pancm.test.demo;

import org.springframework.util.StopWatch;

/**
 * @Author lizhijiang
 * @Version
 * @Description
 * @CreateTime 2022年08月23日 17:15
 */
public class HashMapTest {
    public static void main(String[] args) {
        long num = 100000*100000;
        long startTimeMillis1 = System.currentTimeMillis();
        long result = 1;
        for (long i = 1; i < num; i++) {
            result %= i;
        }
        long endTimeMillis1 = System.currentTimeMillis();
        System.out.println("%: "+ (endTimeMillis1 - startTimeMillis1));

        long startTimeMillis2 = System.currentTimeMillis();
        result = 1;
        for (long i = 1; i < num; i++) {
            result &= i;
        }
        long endTimeMillis2 = System.currentTimeMillis();
        System.out.println("&: "+ (endTimeMillis2 - startTimeMillis2));
    }
}
