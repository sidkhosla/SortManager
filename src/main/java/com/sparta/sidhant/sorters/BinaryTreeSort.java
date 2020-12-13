package com.sparta.sidhant.sorters;

import com.sparta.sidhant.binarytree.BinarySorter;

public class BinaryTreeSort implements SorterInterface {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        BinarySorter binarySorter = new BinarySorter(arrayToSort[0]);
        binarySorter.addElements(arrayToSort);
        arrayToSort = binarySorter.getSortedTreeAsc();
        return arrayToSort;
    }

    public static int[] main(int[] arrayToSort) {

        BinaryTreeSort test = new BinaryTreeSort();
        arrayToSort = test.sortArray(arrayToSort);

        for(int i:  arrayToSort) {
            System.out.println(i);
        }
        return arrayToSort;
    }

}
