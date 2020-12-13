package com.sparta.sidhant.factory;

import com.sparta.sidhant.sorters.SorterInterface;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Display {

    public static void beginProgram() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose a sorting algorithm from the following (enter the number): " +
                "\n1. Selection Sort" + "\n2. Binary sort" + "\n3. Bubble Sort" + "\n4. Merge Sort" +
                "\n5. Quick Sort" + "\n6. Insertion sort");
        int sorter =  scanner.nextInt();

        if(sorter > 6) {
            System.out.println("please enter a valid number:");
            sorter = scanner.nextInt();
        }

        SorterInterface requestedSorterInterface = getSorter(sorter);
        System.out.println("What is the size of the array you want to be sorted?");
        int size = scanner.nextInt();
        System.out.println("Give the highest numbers you want the elements to be in the range of ?");
        int range = scanner.nextInt();
        int[] arrayToSort = createArray(size, range);
        System.out.println("unsorted array:");
        System.out.println(Arrays.toString(arrayToSort));

        Long start = System.nanoTime();
        int[] sortedArray = requestedSorterInterface.sortArray(arrayToSort);
        Long finish = System.nanoTime();
        Long totalTime = (finish - start);
        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(sortedArray));
        System.out.println("time taken: " + totalTime + " nano seconds");
    }

    private static int[] createArray(int size, int range) {
        Random random = new Random();
        int[] result = new int[size];
        for(int i=0; i<result.length; i++) {
            result[i] = random.nextInt(range);
        }
        return result;
    }

    private static SorterInterface getSorter(int sorter) {

        switch(sorter) {
            case 1: return Factory.getSorter("SelectionSort");
            case 2: return Factory.getSorter("BinarySorter");
            case 3: return Factory.getSorter("BubbleSort");
            case 4: return Factory.getSorter("MergeSort");
            case 5: return Factory.getSorter("QuickSort");
            case 6: return Factory.getSorter("InsertionSort");
        }

        return null;
    }
}
