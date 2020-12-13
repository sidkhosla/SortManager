package org.sort;

import com.sparta.sidhant.sorters.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestingSort {


    @Test
    void BinarySortManagerTest(){
        Assertions.assertArrayEquals(new int[]{2, 9, 10}, BinaryTreeSort.main(new int[]{10, 9, 2}));
    }
    @Test
    void BubbleSortManagerTest(){
        Assertions.assertArrayEquals(new int[]{2, 9, 10}, BubbleSort.main(new int[]{10, 9, 2}));
    }
    @Test
    void InsertionSortManagerTest(){
        Assertions.assertArrayEquals(new int[]{2, 9, 10}, InsertionSort.main(new int[]{10, 9, 2}));
    }
    @Test
    void MergeSortManagerTest(){
        Assertions.assertArrayEquals(new int[]{2, 9, 10}, MergeSort.main(new int[]{10, 9, 2}));
    }
    @Test
    void QuickSortManagerTest(){
        Assertions.assertArrayEquals(new int[]{2, 9, 10}, QuickSort.main(new int[]{10, 9, 2}));
    }
    @Test
    void SelectionSortManagerTest(){
        Assertions.assertArrayEquals(new int[]{2, 9, 10}, SelectionSort.main(new int[]{10, 9, 2}));
    }

}
