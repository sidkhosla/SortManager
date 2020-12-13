package com.sparta.sidhant.sorters;

public class InsertionSort implements SorterInterface {
    @Override
    public int[] sortArray(int[] arrayToSort) {

        int length = arrayToSort.length;
        for (int i = 1; i < length; ++i) {
            int key = arrayToSort[i];
            int j = i - 1;

            while (j >= 0 && arrayToSort[j] > key) {
                arrayToSort[j + 1] = arrayToSort[j];
                j = j - 1;
            }
            arrayToSort[j + 1] = key;
        }

        return arrayToSort;
    }

    public static int[] main(int[] arrayToSort) {

        InsertionSort test = new InsertionSort();
        arrayToSort = test.sortArray(arrayToSort);

        for(int i:  arrayToSort) {
            System.out.println(i);
        }
        return arrayToSort;
    }
}