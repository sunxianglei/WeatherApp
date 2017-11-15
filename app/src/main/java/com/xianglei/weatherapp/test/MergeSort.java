package com.xianglei.weatherapp.test;

import java.util.Arrays;

/**
 * 归并排序
 * 采用分治思想，通过递归将数组划分成多个小数组直到只剩一个元素的数组然后合并
 * 两个数组合并的时候分别从最起始位置比较，如果左边数组此时索引的元素大于右边的，则将右边的元素放到临时数组中并将索引加一
 * 以此类推，这样临时数组就是两个数组合并的有序数组，再将临时数组复制给原数组。
 * 时间复杂度：O(nlogn)
 * 空间复杂度：O(n)
 * 算法稳定性：稳定
 * Created by sheng on 2017/11/15.
 */

public class MergeSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        long before = System.currentTimeMillis();
        mergeSort(array, 0, array.length - 1);
        long after = System.currentTimeMillis();
        System.out.println("MergeSortTime-->" + (after - before));
    }

    private void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            //找出中间索引
            int center = (left + right) / 2;
            //对左边数组进行递归
            mergeSort(array, left, center);
            //对右边数组进行递归
            mergeSort(array, center + 1, right);
            //合并
            merge(array, left, center, right);
        }
    }

    private void merge(int[] array, int left, int center, int right) {
        int[] tmpArr = new int[array.length];
        int mid = center + 1;
        int third = left;//third记录中间数组的索引
        int tmp = left;//复制时用到的索引
        while (left <= center && mid <= right) {
            //从两个数组中取出最小的放入中间数组
            if (array[left] <= array[mid]) {
                tmpArr[third++] = array[left++];
            } else {
                tmpArr[third++] = array[mid++];
            }
        }

        //剩余部分依次放入中间数组
        while (mid <= right) {
            tmpArr[third++] = array[mid++];
        }

        while (left <= center) {
            tmpArr[third++] = array[left++];
        }

        //将中间数组中的内容复制回原数组
        while (tmp <= right) {
            array[tmp] = tmpArr[tmp++];
        }
        System.out.println(Arrays.toString(array));
    }
}
