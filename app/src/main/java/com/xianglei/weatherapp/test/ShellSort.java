package com.xianglei.weatherapp.test;

import java.util.Arrays;

/**
 * 希尔排序（属于插入排序）
 * 取一个增量d = n/2，使得距离为d的元素分在一组进行直接插入排序，然后再取d/=2进行插入排序，最后增量d为1时排序完成。
 * 时间复杂度：O(nlogn) or O(n^1.3)
 * 空间复杂度：O(1)
 * Created by sheng on 2017/11/15.
 */

public class ShellSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        long before = System.currentTimeMillis();
        shellSort(array);
        long after = System.currentTimeMillis();
        System.out.println("ShellSortTime-->" + (after - before));
    }

    private void shellSort(int[] array) {
        for (int n = array.length, d = n / 2; d > 0; d /= 2) {//取增量为长度的一半，每次减半，直到d=1，但是d=1必须得排序，因此最后的判断为d>0
            for (int x = 0; x < d; x++) {//分组
                for (int i = x + d; i < n; i += d) {//每组进行直接插入排序
                    int temp = array[i];
                    int j = i - d;
                    for (; j >= 0 && array[j] > temp; j = j - d) {
                        array[j + d] = array[j];
                    }
                    array[j + d] = temp;
                }
            }
        }
        System.out.println("希尔排序后：" + Arrays.toString(array));
    }

}
