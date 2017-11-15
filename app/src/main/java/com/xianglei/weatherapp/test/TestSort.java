package com.xianglei.weatherapp.test;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by sheng on 2017/11/15.
 */

public class TestSort {
    public static void main(String args[]){
        int[] array = randomFactory(1000000,100000);
        int[] array1 = array.clone();
        int[] array2 = array.clone();
        SortAlgorithm quickSort = new QuickSort();
        quickSort.sort(array);
//        SortAlgorithm bubbleSort = new BubbleSort();
//        bubbleSort.sort(array1);
        SortAlgorithm heapSort = new HeapSort();
        heapSort.sort(array2);
    }

    private static int[] randomFactory(int num, int max){
        int[] array = new int[num];
        Random random = new Random();
        for(int i =0;i < num; i++){
            array[i] = random.nextInt(max);
        }
        return array;
    }
}
