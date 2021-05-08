package ru.vsu.cs;

import ru.vsu.cs.common.MySelectionSort;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Integer[] data = ArrayUtil.toObject(ArrayUtil.setArray(readLine("Enter array of digits: ")));
        boolean[] fixed = ArrayUtil.getFixedPosition(readLine("Enter array of logical values: "));

        printArray(data, fixed);

        MySelectionSort.sort(data, fixed);

        System.out.println("Sorted array:");
        printArray(data, fixed);
    }

    public static void printArray(Integer[] data, boolean[] fixed) {
        System.out.print("{ ");
        for (int i = 0; i < data.length; i++) {
            if (!fixed[i]) {
                System.out.print(data[i] + ", ");
            } else
                System.out.print("[" + data[i] + "]" + ", ");
        }
        System.out.println("}");
    }

    public static String readLine(String name) {
        Scanner scn = new Scanner(System.in);
        System.out.print(name);
        return scn.nextLine();
    }
}
