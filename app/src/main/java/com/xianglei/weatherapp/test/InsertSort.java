package com.xianglei.weatherapp.test;

import java.util.Arrays;

/**
 * 直接插入排序
 * 从起始开始，每遍历到一个元素，就拿这个元素和之前排序好的元素，
 * 从尾到头依次比较，遇到比该元素小的就插到那个位置的后面，后面的元素全部后移一格
 * 时间复杂度：O(n^2)
 * 空间复杂度：O(1)
 * 算法稳定性：稳定
 * Created by sheng on 2017/11/15.
 */

public class InsertSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        long before = System.currentTimeMillis();
        insertSort(array);
        long after = System.currentTimeMillis();
        System.out.println("InsertSortTime-->" + (after - before));
    }

    private void insertSort(int[] array) {
        //从第2个开始往前插
        for (int i = 1, n = array.length; i < n; i++) {
            int temp = array[i];//保存第i个值
            int j = i - 1;//从有序数组的最后一个开始
            for (; j >= 0 && array[j] > temp; j--) {
                array[j + 1] = array[j];//从后往前比较，大于temp的值都得后移
            }
            array[j + 1] = temp;//碰到小于或等于的数停止，由于多减了1，所以加上1后，赋值为插入值temp
        }
        System.out.println("直接插入排序后：" + Arrays.toString(array));
    }

}
