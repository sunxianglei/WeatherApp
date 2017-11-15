package com.xianglei.weatherapp.test;

import java.util.Arrays;

/**
 * 简单选择排序
 * 暴力找出最小的元素和第一个位置交换，再从剩余的元素找出最小的和第二个位置交换，以此类推
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 算法稳定性：不稳定
 * Created by sheng on 2017/11/15.
 */

public class ChooseSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        long before = System.currentTimeMillis();
        selectSort(array);
        long after = System.currentTimeMillis();
        System.out.println("ChooseSortTime-->" + (after - before));
    }

    private void selectSort(int[] array) {
        for (int i = 0, n = array.length; i < n; i++) {
            int j = i + 1;
            int temp = array[i];
            int position = i;
            for (; j < n; j++) {
                if (array[j] < temp) {
                    temp = array[j];
                    position = j;
                }
            }
            array[position] = array[i];
            array[i] = temp;
        }
        System.out.println("简单选择排序后：" + Arrays.toString(array));
    }

}
