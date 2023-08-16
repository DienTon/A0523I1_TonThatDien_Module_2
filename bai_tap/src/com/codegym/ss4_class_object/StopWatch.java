package com.codegym.ss4_class_object;

import com.codegym.ss3_array.NhapXuat;

import java.util.Random;

public class StopWatch {
    private long startTime, endTime;

    public StopWatch() {
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }

    public void sapXepSelectionSort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }


    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        int[] arr = new int[100000];
        Random rd = new Random();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(100000);
        }

        stopWatch.sapXepSelectionSort(arr);
        NhapXuat.xuat(arr);
        stopWatch.stop();
        System.out.println("\nmang duoc sap xep trong vong " + stopWatch.getElapsedTime() + " mili giay");

    }
}
