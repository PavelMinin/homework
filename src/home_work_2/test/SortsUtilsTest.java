package home_work_2.test;

import home_work_2.utils.SortsUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SortsUtilsTest {
    public final int[] arr1 = new int[0];
    public final int[] arr2 = {4, 17, 32};
    public final int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
    public final int[] arr4 = {0, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    public final int[] arr5 = {1, 1, 1, 1};
    public final int[] arr6 = {126, 13, 345, 7654, 1 ,-569, 1024, 96857, 3, -55, 7};
    public final int[] arr7 = null;
    public final int[] arr8 = {1, 2, 3, 4, 5, 6};
    public final int[] arr9 = {9, 1, 5, 99, 9, 9};
    public final int[] arr10 = {6, 5, 4, 3, 2, 1};

    public final int[] arrExp1 = new int[0];
    public final int[] arrExp2 = {4, 17, 32};
    public final int[] arrExp3 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public final int[] arrExp4 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public final int[] arrExp5 = {1, 1, 1, 1};
    public final int[] arrExp6 = {-569, -55, 1, 3, 7, 13, 126, 345, 1024, 7654, 96857};
    public final int[] arrExp7 = null;
    public final int[] arrExp8 = {1, 2, 3, 4, 5, 6};
    public final int[] arrExp9 = {1, 5, 9, 9, 9, 99};
    public final int[] arrExp10 = {1, 2, 3, 4, 5, 6};

    @Test
    @DisplayName("Bubble sort test")
    public void bubbleSortTest() {
        int[] arrForSort1 = arr1.clone();
        int[] arrForSort2 = arr2.clone();
        int[] arrForSort3 = arr3.clone();
        int[] arrForSort4 = arr4.clone();
        int[] arrForSort5 = arr5.clone();
        int[] arrForSort6 = arr6.clone();
        int[] arrForSort7 = null;
        int[] arrForSort8 = arr8.clone();
        int[] arrForSort9 = arr9.clone();
        int[] arrForSort10 = arr10.clone();

        SortsUtils.bubble(arrForSort1);
        SortsUtils.bubble(arrForSort2);
        SortsUtils.bubble(arrForSort3);
        SortsUtils.bubble(arrForSort4);
        SortsUtils.bubble(arrForSort5);
        SortsUtils.bubble(arrForSort6);
        SortsUtils.bubble(arrForSort7);
        SortsUtils.bubble(arrForSort8);
        SortsUtils.bubble(arrForSort9);
        SortsUtils.bubble(arrForSort10);

        Assertions.assertTrue(ArraysTest.checkArrays(arrExp1, arrForSort1));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp2, arrForSort2));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp3, arrForSort3));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp4, arrForSort4));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp5, arrForSort5));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp6, arrForSort6));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp7, arrForSort7));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp8, arrForSort8));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp9, arrForSort9));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp10, arrForSort10));
    }

    @Test
    @DisplayName("Shake sort test")
    public void shakeSortTest() {
        int[] arrForSort1 = arr1.clone();
        int[] arrForSort2 = arr2.clone();
        int[] arrForSort3 = arr3.clone();
        int[] arrForSort4 = arr4.clone();
        int[] arrForSort5 = arr5.clone();
        int[] arrForSort6 = arr6.clone();
        int[] arrForSort7 = null;
        int[] arrForSort8 = arr8.clone();
        int[] arrForSort9 = arr9.clone();
        int[] arrForSort10 = arr10.clone();

        SortsUtils.shake(arrForSort1);
        SortsUtils.shake(arrForSort2);
        SortsUtils.shake(arrForSort3);
        SortsUtils.shake(arrForSort4);
        SortsUtils.shake(arrForSort5);
        SortsUtils.shake(arrForSort6);
        SortsUtils.shake(arrForSort7);
        SortsUtils.shake(arrForSort8);
        SortsUtils.shake(arrForSort9);
        SortsUtils.shake(arrForSort10);

        Assertions.assertTrue(ArraysTest.checkArrays(arrExp1, arrForSort1));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp2, arrForSort2));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp3, arrForSort3));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp4, arrForSort4));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp5, arrForSort5));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp6, arrForSort6));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp7, arrForSort7));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp8, arrForSort8));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp9, arrForSort9));
        Assertions.assertTrue(ArraysTest.checkArrays(arrExp10, arrForSort10));
    }
}
