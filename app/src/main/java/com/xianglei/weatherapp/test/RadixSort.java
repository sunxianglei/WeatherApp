package com.xianglei.weatherapp.test;

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

    }
}
