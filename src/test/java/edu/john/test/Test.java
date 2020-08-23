package edu.john.test;

public class Test {
    public static void main(String[] args) {
        int[][] scores = {
                { 82, 90, 91 },
                { 68, 72, 64 },
                { 95, 91, 89 },
                { 67, 52, 60 },
                { 79, 81, 85 },
        };
        // TODO 二维数组求平均数
        double sum=0.0;
        int count=0;
        for (int[] arr : scores ) {
            for (int n : arr) {
                sum+=n;
                count++;
            }
        }
        double average = sum/(count*1.0);
        System.out.println(average);
    }
}