package com.sparta.sidhant.sorters;

public class BubbleSort implements SorterInterface {
    @Override
    public int[] sortArray(int[] array) {
        for (var i = 0; i < array.length; i++)
            for (var j = 1; j < array.length; j++)
                if (array[j] < array[j - 1])
                    swap(array, j, j - 1);
        return array;

    }


    private void swap(int[] array, int index1, int index2) {
        var temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;


    }

    public static int[] main(int[] arrayToSort) {
        BubbleSort test = new BubbleSort();
        arrayToSort = test.sortArray(arrayToSort);

        for (int i : arrayToSort) {
            System.out.println(i);
        }
        return arrayToSort;
    }
}