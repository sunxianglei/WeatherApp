package com.xianglei.weatherapp.test;

import java.util.Arrays;

/**
 * 堆排序（属于选择排序）
 * 首先堆是一个完全二叉树，最大堆概念是父节点比左右子节点要大
 * 将未排序数组转为最大堆：从有最后一个子节点的父节点开始（即n/2-1那个数），与左右节点比较后调整，一直比到0索引处。
 * 然后取堆顶那个数就是最大数与最后一个数交换，排除最后一个数，剩余的数再次调整为最大堆，也是通过递归。
 * 时间复杂度：O(nlogn)
 * 空间复杂度：O(1)
 * 算法稳定性：不稳定
 * Created by sheng on 2017/11/15.
 */

public class HeapSort implements SortAlgorithm{
    @Override
    public void sort(int[] array) {
        long before = System.currentTimeMillis();
        heapSort(array);
        long after = System.currentTimeMillis();
        System.out.println("HeapSortTime-->" + (after - before));
    }

    private void heapSort(int[] array){

        int length = array.length;
        int startIndex = length / 2 - 1;
        for(int i=startIndex;i>=0;i--){
            heapAdjust(array, length, i);
//            System.out.println(Arrays.toString(array));
        }

        for (int i = length - 1;i >= 0;i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapAdjust(array, i, 0);
//            System.out.println(Arrays.toString(array));
        }
    }

    private void heapAdjust(int[] array, int heapSize, int index){
        int childLeft = 2 * index + 1;
        int childRight = 2 * index + 2;
        int largestIndex = index;
        if(childLeft < heapSize && array[largestIndex] < array[childLeft]){
            largestIndex = childLeft;
        }
        if(childRight < heapSize && array[largestIndex] < array[childRight]){
            largestIndex = childRight;
        }
        if(largestIndex!=index){
            int temp = array[largestIndex];
            array[largestIndex] = array[index];
            array[index] = temp;
            heapAdjust(array, heapSize, largestIndex);
        }
    }
}
