package com.xianglei.weatherapp.test;

import java.util.Arrays;

/**
 * 基数排序
 * 第一次：先取个位数作为行索引，依次存放到二维数组（行为0~9，列为未排序数组个数）中，遇到相同的列数会依次增加，
 * 同时需要一个一维数组（10列）记录0~9出现的次数，会用这个数组来遍历二维数组每行的数据，然后重新存到结果数组中
 * 依次计算十位、百位···直到最高位（最高位最大的一定是最大的数）
 * 时间复杂度：O(d(r+n))      r代表关键字基数（0~9范围内），d代表最大数的长度，n代表关键字个数
 * 空间复杂度：O(rd+n)
 * 算法稳定性：稳定
 * Created by sheng on 2017/11/15.
 */

public class RadixSort implements SortAlgorithm {
    @Override
    public void sort(int[] array) {
        long before = System.currentTimeMillis();
        radixSort(array);
        long after = System.currentTimeMillis();
        System.out.println("RadixSortTime-->" + (after - before));
    }

    private void radixSort(int[] array) {
        int max = array[0];
        final int length = array.length;
        for (int i = 1; i < length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int time = 0;//数组最大值位数
        while (max > 0) {
            max /= 10;
            time++;
        }

        int k = 0; //重新放入数组的索引
        int n = 1; //位值，如1，10，100
        int m = 1; //当前在哪一位
        int[][] temp = new int[10][length]; //数组的第一维表示该位数值，二维表示具体的值
        int[] order = new int[10]; //数组order[i]用来表示该位是i的数的个数
        while (m <= time) {

            for (int num : array) {
                int lsd = (num / n) % 10;//获取该位的基数0-9
                temp[lsd][order[lsd]] = num;
                order[lsd]++;
            }

            for (int i = 0; i < 10; i++) {
                if (order[i] != 0) {
                    for (int j = 0; j < order[i]; j++) {
                        array[k] = temp[i][j];//基于m位的重新放入数组中
                        k++;
                    }
                }
                order[i] = 0;//复位
            }
            System.out.println("第" + m + "位排序：" + Arrays.toString(array));
            n *= 10;
            k = 0;//复位
            m++;
        }

        System.out.println("基数排序后：" + Arrays.toString(array));
    }
}
