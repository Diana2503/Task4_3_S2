package ru.vsu.cs.test;

import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.common.MySelectionSort;

public class SelectionSortTest {

    @Test
    public void convertArrayTest1() {
        Integer[] firstSoursArray = {2, 7, 3, 1, 2, 4, 9};
        boolean[] secondSourceArray = {false, false, true, false, true, false, false};
        MySelectionSort.sort(firstSoursArray, secondSourceArray);
        Integer[] resultArray = {1, 2, 3, 4, 2, 7, 9};
        Assert.assertArrayEquals(firstSoursArray, resultArray);
    }

    @Test
    public void convertArrayTest2() {
        Integer[] firstSoursArray = {2, 7, 3, 1};
        boolean[] secondSourceArray = {false, false, true, false};
        MySelectionSort.sort(firstSoursArray, secondSourceArray);
        Integer[] resultArray = {1, 2, 3, 7};
        Assert.assertArrayEquals(firstSoursArray, resultArray);
    }

    @Test
    public void convertArrayTest3() {
        Integer[] firstSoursArray = {7, 10, 3, 8, 7, 2, 1, 9, 5, 7};
        boolean[] secondSourceArray = {false, true, false, false, true, true, false, false, true, false};
        MySelectionSort.sort(firstSoursArray, secondSourceArray);
        Integer[] resultArray = {1, 10, 3, 7, 7, 2, 7, 8, 5, 9};
        Assert.assertArrayEquals(firstSoursArray, resultArray);
    }
}