package home_work_4.test;

import home_work_4.container.DataContainer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import students.Student;

public class DataContainerTest {

    @Test
    @DisplayName("Добавдление одного простого элемента в контейнер")
    public void addString() {
        DataContainer<String> container = new DataContainer<>(new String[0]);

        String str1 = "Строка 1";
        int i = container.add(str1);

        Assertions.assertEquals(str1, container.get(i));
    }

    @Test
    @DisplayName("Добавдление двух простых элементов в контейнер")
    public void addTwoStrings() {
        DataContainer<String> container = new DataContainer<>(new String[0]);

        String str1 = "Строка 1";
        String str2 = "Строка 2";
        int i = container.add(str1);
        int j = container.add(str2);

        Assertions.assertEquals(str1, container.get(i));
        Assertions.assertEquals(str2, container.get(j));
    }

    @Test
    @DisplayName("Добавдление одного сложного элемента в контейнер")
    public void addObject() {
        DataContainer<Student> container = new DataContainer<>(new Student[0]);

        Student student = new Student( 0,"Тестовый студент", 16, 8.1, true);
        int i = container.add(student);

        Assertions.assertEquals(student, container.get(i));
    }

    @Test
    @DisplayName("Добавление двух сложных элементов в контейнер")
    public void addTwoObjects() {
        DataContainer<Student> container = new DataContainer<>(new Student[0]);

        Student student1 = new Student( 0,"Тестовый студент 1", 16, 8.1, true);
        Student student2 = new Student( 0,"Тестовый студент 2", 15, 6.9, false);
        int i = container.add(student1);
        int j = container.add(student2);

        Assertions.assertEquals(student1, container.get(i));
        Assertions.assertEquals(student2, container.get(j));
    }

    @Test
    @DisplayName("Инициализация массивом без null и добавление элемента")
    public void initArrayWithoutNullsAndAddInTheMiddle() {
        DataContainer<String> container = new DataContainer<>(new String[] {"Строка 1", "Строка 2"});

        String str3 = "Строка 3";
        int i = container.add(str3);

        Assertions.assertEquals("Строка 1", container.get(0));
        Assertions.assertEquals("Строка 2", container.get(1));
        Assertions.assertEquals(str3, container.get(2));
    }

    @Test
    @DisplayName("Инициализация массивом c null и добавление элемента")
    public void initArrayWithNullsAndAddInTheMiddle() {
        DataContainer<String> container = new DataContainer<>(new String[] {null, "Строка 2"});

        String str3 = "Строка 3";
        int i = container.add(str3);

        Assertions.assertEquals(str3, container.get(0));
        Assertions.assertEquals("Строка 2", container.get(1));
    }

    @Test
    @DisplayName("Инициализация массивом с null и добавление")
    public void addInt() {
        Integer[] init = {1, 2, 3, null, null, null};
        DataContainer<Integer> container = new DataContainer<>(init);

        Integer num1 = 777;
        int i = container.add(num1);

        Assertions.assertEquals(init[0], container.get(0));
        Assertions.assertEquals(init[1], container.get(1));
        Assertions.assertEquals(init[2], container.get(2));
        Assertions.assertEquals(num1, container.get(i));
        Assertions.assertEquals(init[4], container.get(4));
        Assertions.assertEquals(init[5], container.get(5));
    }

    @Test
    @DisplayName("Инициализация массивом с null в середине и добавление")
    public void addIntInTheMiddle() {
        Integer[] init = {1, null, 3, null, null, null};
        DataContainer<Integer> container = new DataContainer<>(init);

        Integer num1 = 777;
        int i = container.add(num1);

        Assertions.assertEquals(init[0], container.get(0));
        Assertions.assertEquals(num1, container.get(i));
        Assertions.assertEquals(init[2], container.get(2));
        Assertions.assertEquals(init[3], container.get(3));
        Assertions.assertEquals(init[4], container.get(4));
        Assertions.assertEquals(init[5], container.get(5));
    }

    @Test
    @DisplayName("Добавление null")
    public void addNull() {
        Integer[] init = {1, 2, 3, null, null, null};
        DataContainer<Integer> container = new DataContainer<>(init);

        int i = container.add(null);

        Assertions.assertEquals(init[0], container.get(0));
        Assertions.assertEquals(init[1], container.get(1));
        Assertions.assertEquals(init[2], container.get(2));
        Assertions.assertEquals(init[3], container.get(3));
        Assertions.assertEquals(init[4], container.get(4));
        Assertions.assertEquals(init[5], container.get(5));
        Assertions.assertEquals(-1, i);
    }

    @Test
    @DisplayName("Инициализация массивом без null и добавление")
    public void addInFullArray() {
        Integer[] init = {1, 2, 3};
        DataContainer<Integer> container = new DataContainer<>(init);

        int i = container.add(777);

        Assertions.assertEquals(init[0], container.get(0));
        Assertions.assertEquals(init[1], container.get(1));
        Assertions.assertEquals(init[2], container.get(2));
        Assertions.assertEquals(777, container.get(i));
        Assertions.assertEquals(3, i);
    }

    @Test
    @DisplayName("Инициализация пустым массивом и добавление")
    public void addInEmptyArray() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[0]);

        int i = container.add(777);

        Assertions.assertEquals(777, container.get(0));
        Assertions.assertEquals(0, i);
    }

    @Test
    @DisplayName("Возвращение элемента с индексом вне границ")
    public void getOverIndexLimit() {
        DataContainer<Integer> container = new DataContainer<>(new Integer[0]);

        int i = container.add(9999);

        Assertions.assertEquals(9999, container.get(0));
        Assertions.assertEquals(0, i);
        Assertions.assertNull(container.get(1));
    }

    @Test
    @DisplayName("Удаление элемента по индексу")
    public void deleteIndex() {
        Integer[] init = {1, 2, 3, 777};
        DataContainer<Integer> container = new DataContainer<>(init);

        boolean result = container.delete(3);

        Assertions.assertEquals(init[0], container.get(0));
        Assertions.assertEquals(init[1], container.get(1));
        Assertions.assertEquals(init[2], container.get(2));
        Assertions.assertNull(container.get(3));
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Удаление элемента из середины")
    public void deleteIndex2() {
        Integer[] init = {1, 2, 3, 777};
        DataContainer<Integer> container = new DataContainer<>(init);

        boolean result = container.delete(2);

        Assertions.assertEquals(init[0], container.get(0));
        Assertions.assertEquals(init[1], container.get(1));
        Assertions.assertEquals(init[3], container.get(2));
        Assertions.assertNull(container.get(4));
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Удаление элемента с индесом вне диапазона")
    public void deleteIndexOverLimit() {
        Integer[] init = {1, 2, 3, 777};
        DataContainer<Integer> container = new DataContainer<>(init);

        boolean result = container.delete(9);

        Assertions.assertEquals(init[0], container.get(0));
        Assertions.assertEquals(init[1], container.get(1));
        Assertions.assertEquals(init[2], container.get(2));
        Assertions.assertEquals(init[3], container.get(3));
        Assertions.assertFalse(result);
    }
    @Test
    @DisplayName("Удаление элемента по значению")
    public void deleteItem() {
        Integer[] init = {1, 2, 3, 777};
        DataContainer<Integer> container = new DataContainer<>(init);

        Integer item = 777;
        boolean result = container.delete(item);

        Assertions.assertEquals(init[0], container.get(0));
        Assertions.assertEquals(init[1], container.get(1));
        Assertions.assertEquals(init[2], container.get(2));
        Assertions.assertNull(container.get(3));
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Удаление элемента по значению с несколькими совпадениями")
    public void deleteItem2() {
        Integer[] init = {1, 2, 3, 777, 3};
        DataContainer<Integer> container = new DataContainer<>(init);

        Integer item = 3;
        boolean result = container.delete(item);

        Assertions.assertEquals(1, container.get(0));
        Assertions.assertEquals(2, container.get(1));
        Assertions.assertEquals(777, container.get(2));
        Assertions.assertEquals(3, container.get(3));
        Assertions.assertNull(container.get(5));
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Удаление элемента не совпадающего с содержимым")
    public void deleteNonExistentItem() {
        Integer[] init = {1, 2, 3, 777};
        DataContainer<Integer> container = new DataContainer<>(init);

        Integer item = 111;
        boolean result = container.delete(item);

        Assertions.assertEquals(init[0], container.get(0));
        Assertions.assertEquals(init[1], container.get(1));
        Assertions.assertEquals(init[2], container.get(2));
        Assertions.assertEquals(init[3], container.get(3));
        Assertions.assertFalse(result);
    }
}
