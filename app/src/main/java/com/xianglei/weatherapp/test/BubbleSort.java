package com.xianglei.weatherapp.test;

import java.util.Arrays;

/**
 * 冒泡排序（属于交换排序）
 * 从数组最后开始与相邻的数比较，冒上去之后第一个数就是最小的。
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 算法稳定性：稳定
 * Created by sheng on 2017/11/15.
 */

public class BubbleSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        long before = System.currentTimeMillis();
        bubbleSort(array);
        long after = System.currentTimeMillis();
        System.out.println("BubbleSortTime-->" + (after - before));
    }

    private void bubbleSort(int[] array){
        int length = array.length;
        for(int i=0;i<length;i++){
            for(int j = length - 1;j > i;j--){
                if(array[j] < array[j-1]){
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
//            System.out.println(Arrays.toString(array));
        }
    }
}
