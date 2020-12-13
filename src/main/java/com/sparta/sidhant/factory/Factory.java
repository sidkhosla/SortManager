package com.sparta.sidhant.factory;

import com.sparta.sidhant.sorters.*;

public class Factory {
    public static SorterInterface getSorter(String sorter) {
        switch (sorter) {
            case "BubbleSort":
                return new BubbleSort();
            case "InsertionSort":
                return new InsertionSort();
            case "SelectionSort":
                return new SelectionSort();
            case "QuickSort":
                return new QuickSort();
            case "MergeSort":
                return new MergeSort();
            case "BinarySorter":
                return new BinaryTreeSort();
            default:
                return null;
        }
    }
}