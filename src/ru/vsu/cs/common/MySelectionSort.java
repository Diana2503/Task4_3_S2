package ru.vsu.cs.common;

public class MySelectionSort {
    public static <T extends Comparable<T>> void sort(T[] data, boolean[] fixed) {
        int size = data.length;
        for (int i = 0; i < size - 1; i++) {
            if (!fixed[i]) {
                int minIndex = i;
                for (int j = i + 1; j < size; j++) {
                    if ((!fixed[j]) && data[j].compareTo(data[minIndex]) < 0) {
                        minIndex = j;
                    }
                }
                T tmp = data[i];
                data[i] = data[minIndex];
                data[minIndex] = tmp;
            }
        }
    }
}
