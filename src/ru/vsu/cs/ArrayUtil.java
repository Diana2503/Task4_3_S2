package ru.vsu.cs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

       /**
        * Набор функций для работы с массивами
        *
        * @author Дмитрий Соломатин (кафедра ПиИТ ФКН ВГУ)
        */

public class ArrayUtil {
    public static int[] setArray(String line) {
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter("(\\s|[,;])+");
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        int sizeArray = list.size();
        int[] array = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    public static String toString(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder(arr[0] + " ");
        for (int i = 1; i < arr.length; i++) {
            stringBuilder.append(arr[i]).append(" ");
        }
        return stringBuilder.toString();
    }

    public static int[] toPrimitive(Integer[] arr) {
        if (arr == null) {
            return null;
        }
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public static Integer[] toObject(int[] arr) {
        if (arr == null) {
            return null;
        }
        Integer[] result = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        return result;
    }

    public static boolean[] getFixedPosition(String data) {
        boolean[] fixed = new boolean[data.length() / 2 + 1];
        int counter = 0;
        for (int i = 0; i < data.length(); i++) {
            char currChar = data.charAt(i);
            if (currChar != ' ') {
                fixed[counter] = currChar == '1';
                counter++;
            }
        }
        return fixed;
    }
}
