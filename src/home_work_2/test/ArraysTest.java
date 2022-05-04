package home_work_2.test;

import home_work_2.arrays.Arrays_2_4;
import home_work_2.arrays.new_version.DoWhileOperation_new;
import home_work_2.arrays.new_version.ForEachOperation_new;
import home_work_2.arrays.new_version.ForOperation_new;
import home_work_2.arrays.new_version.WhileOperation_new;
import home_work_2.arrays.new_version.api.IArraysOperation_new;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ArraysTest {
    public final int[] arr1 = new int[0];
    public final int[] arr2 = {4, 17, 32};
    public final int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    public final int[] arr4 = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    public final int[] arr5 = {1, 1, 1, 1, 1};
    public final int[] arr6 = {126, 13, 345, 7654, 1 ,-569, 1024, 96857, 3, -55, 7};
    public final int[] arr7 = null;

    public final String eachExpected1 = "";
    public final String eachExpected2 = "4\t17\t32\t";
    public final String eachExpected3 = "1\t2\t3\t4\t5\t6\t7\t8\t9\t0\t";
    public final String eachExpected4 = "0\t9\t8\t7\t6\t5\t4\t3\t2\t1\t";
    public final String eachExpected5 = "1\t1\t1\t1\t1\t";
    public final String eachExpected6 = "126\t13\t345\t7654\t1\t-569\t1024\t96857\t3\t-55\t7\t";
    public final String eachExpected7 = null;

    public final String eachSecondExpected1 = "";
    public final String eachSecondExpected2 = "17\t";
    public final String eachSecondExpected3 = "2\t4\t6\t8\t0\t";
    public final String eachSecondExpected4 = "9\t7\t5\t3\t1\t";
    public final String eachSecondExpected5 = "1\t1\t";
    public final String eachSecondExpected6 = "13\t7654\t-569\t96857\t-55\t";
    public final String eachSecondExpected7 = null;

    public final String invertedExpected1 = "";
    public final String invertedExpected2 = "32\t17\t4\t";
    public final String invertedExpected3 = "0\t9\t8\t7\t6\t5\t4\t3\t2\t1\t";
    public final String invertedExpected4 = "1\t2\t3\t4\t5\t6\t7\t8\t9\t0\t";
    public final String invertedExpected5 = "1\t1\t1\t1\t1\t";
    public final String invertedExpected6 = "7\t-55\t3\t96857\t1024\t-569\t1\t7654\t345\t13\t126\t";
    public final String invertedExpected7 = null;

    @Test
    @DisplayName("Тест методов различных реализаций интерфейса IArraysOperation_new.")
    public void doWhileOperationTest() {
        DoWhileOperation_new arrayIterator1 = new DoWhileOperation_new();
        WhileOperation_new arrayIterator2 = new WhileOperation_new();
        ForOperation_new arrayIterator3 = new ForOperation_new();
        ForEachOperation_new arrayIterator4 = new ForEachOperation_new();

        compareResults(arrayIterator1);
        compareResults(arrayIterator2);
        compareResults(arrayIterator3);
        compareResults(arrayIterator4);
    }

    private void compareResults(IArraysOperation_new arrayIterator) {
        Assertions.assertEquals(eachExpected1, arrayIterator.getArrayElements(arr1));
        Assertions.assertEquals(eachExpected2, arrayIterator.getArrayElements(arr2));
        Assertions.assertEquals(eachExpected3, arrayIterator.getArrayElements(arr3));
        Assertions.assertEquals(eachExpected4, arrayIterator.getArrayElements(arr4));
        Assertions.assertEquals(eachExpected5, arrayIterator.getArrayElements(arr5));
        Assertions.assertEquals(eachExpected6, arrayIterator.getArrayElements(arr6));
        Assertions.assertNull(arrayIterator.getArrayElements(arr7));

        Assertions.assertEquals(eachSecondExpected1, arrayIterator.getEachSecondArrayElement(arr1));
        Assertions.assertEquals(eachSecondExpected2, arrayIterator.getEachSecondArrayElement(arr2));
        Assertions.assertEquals(eachSecondExpected3, arrayIterator.getEachSecondArrayElement(arr3));
        Assertions.assertEquals(eachSecondExpected4, arrayIterator.getEachSecondArrayElement(arr4));
        Assertions.assertEquals(eachSecondExpected5, arrayIterator.getEachSecondArrayElement(arr5));
        Assertions.assertEquals(eachSecondExpected6, arrayIterator.getEachSecondArrayElement(arr6));
        Assertions.assertNull(arrayIterator.getEachSecondArrayElement(arr7));

        Assertions.assertEquals(invertedExpected1, arrayIterator.getInvertedArrayElements(arr1));
        Assertions.assertEquals(invertedExpected2, arrayIterator.getInvertedArrayElements(arr2));
        Assertions.assertEquals(invertedExpected3, arrayIterator.getInvertedArrayElements(arr3));
        Assertions.assertEquals(invertedExpected4, arrayIterator.getInvertedArrayElements(arr4));
        Assertions.assertEquals(invertedExpected5, arrayIterator.getInvertedArrayElements(arr5));
        Assertions.assertEquals(invertedExpected6, arrayIterator.getInvertedArrayElements(arr6));
        Assertions.assertNull(arrayIterator.getInvertedArrayElements(arr7));
    }

    @Test
    @DisplayName("Тест методов различных реализаций интерфейса IArraysOperation_new.")
    public void getSumOfEvenElementsTest() {

        Assertions.assertEquals(0, Arrays_2_4.getSumOfEvenElements(arr1));
        Assertions.assertEquals(53, Arrays_2_4.getSumOfEvenElements(arr2));
        Assertions.assertEquals(38, Arrays_2_4.getSumOfEvenElements(arr3));
        Assertions.assertEquals(38, Arrays_2_4.getSumOfEvenElements(arr4));
        Assertions.assertEquals(5, Arrays_2_4.getSumOfEvenElements(arr5));
        Assertions.assertEquals(126 + 13 + 345 + 7654 + 1 + -569 + 1024 + 96857 + 3 + -55 + 7,
                Arrays_2_4.getSumOfEvenElements(arr6));
        Assertions.assertEquals(-1, Arrays_2_4.getSumOfEvenElements(arr7));
    }
}
