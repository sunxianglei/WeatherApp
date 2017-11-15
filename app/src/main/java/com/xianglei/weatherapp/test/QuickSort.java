package com.xianglei.weatherapp.test;

import java.util.Arrays;

/**
 * 快速排序（属于交换排序）
 * 选择一个基数（可选第一个，或者选出中位数）
 * 第一次递归：从数组的最后一个开始比较直到找到比基数小的数停止，从数组第一个开始比较直到找到比基数大的数停止，调换这两个数；
 * 调换之后继续走直到low比high大，这样基数的左边都比其小，右边都比其大。
 * 然后分成左右两半递归。
 * 时间复杂度：O(nlogn)
 * 空间复杂度：O(1)
 * 算法稳定性（相等数的相对位置是否变化）：不稳定
 * Created by sheng on 2017/11/15.
 */

public class QuickSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        long before = System.currentTimeMillis();
        quickSort(array, 0, array.length - 1);
        long after = System.currentTimeMillis();
        System.out.println("QuickSortTime-->" + (after - before));
    }

    /**
     * 自己的实现思路
     * @param array
     * @param low
     * @param high
     */
    private void quickSort(int[] array, int low, int high){
        if(low >= high)
            return;
        int baseIndex = low, left = low, right = high;
        int temp, middle=0;
        while(left < right){
            for( ;array[baseIndex] <= array[right] && left < right;right--);
            for( ;array[baseIndex] >= array[left] && left < right;left++);
            if(left>=right){
                temp = array[baseIndex];
                array[baseIndex] = array[left];
                array[left] = temp;
                middle = left;
                break;
            }
            temp = array[left];
            array[left] = array[right];
            array[right] = temp;
        }
//        System.out.println(Arrays.toString(array));
        quickSort(array, low, middle - 1);
        quickSort(array, middle + 1, high);
    }

    /**
     * 网上实现思路
     * @param array
     * @param low
     * @param high
     */
    private static void _quickSort(int[] array, int low, int high) {
        if (low < high) {
            int middle = getMiddle(array, low, high);  //基于第一个数将array数组进行一分为二
            _quickSort(array, low, middle - 1);      //左边进行递归排序
            _quickSort(array, middle + 1, high);      //右边进行递归排序
        }
    }


    private static int getMiddle(int[] array, int low, int high) {
        int tmp = array[low];    //数组的第一个作为基数
        while (low < high) {    //直到指针重合一趟完成
            while (low < high && array[high] >= tmp) {
                high--;
            }

            array[low] = array[high];   //找到比基数小的
            while (low < high && array[low] <= tmp) {
                low++;
            }

            array[high] = array[low];   //找到比基数大的
        }
        array[low] = tmp;              //基数归位
        System.out.println(Arrays.toString(array));
        return low;                  //返回基数的位置
    }

}
