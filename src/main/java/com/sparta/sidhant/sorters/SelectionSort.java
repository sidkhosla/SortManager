package com.sparta.sidhant.sorters;

public class SelectionSort implements SorterInterface {
    @Override
    public int[] sortArray(int[] arrayToSort) {
        int length = arrayToSort.length;
        for (int i = 0; i < length-1; i++) {

            int min_idx = i;
            for (int j = i+1; j < length; j++)
                if (arrayToSort[j] < arrayToSort[min_idx])
                    min_idx = j;

            int temp = arrayToSort[min_idx];
            arrayToSort[min_idx] = arrayToSort[i];
            arrayToSort[i] = temp;
        }
        return arrayToSort;
    }
    public static int[] main(int[] arrayToSort) {

        SelectionSort test = new SelectionSort();
        arrayToSort = test.sortArray(arrayToSort);

        for(int i:  arrayToSort) {
            System.out.println(i);
        }
        return arrayToSort;
    }
}