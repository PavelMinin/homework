package home_work_2.arrays;

// Наследуем класс от интерфейса IArraysOperation и реализуем все его методы используя while
public class WhileOperation implements IArraysOperation {
    @Override
    public void showArrayElements(int[] array) {
        System.out.println("Вывод каждого элемента массива в строку.");
        int i=0;
        StringBuilder arrayStr = new StringBuilder();
        while (i < array.length) {
            arrayStr.append(array[i]).append("\t");
            i++;
        }
        System.out.println(arrayStr);
    }

    @Override
    public void showEachSecondArrayElement(int[] array) {
        System.out.println("Вывод каждого второго элемента массива в строку.");
        int i = 0;
        StringBuilder arrayStr = new StringBuilder();
        while (i < array.length) {
            if ((i+1) % 2 == 0){
                arrayStr.append(array[i]).append("\t");
            }
            i++;
        }
        System.out.println(arrayStr);
    }

    @Override
    public void showInvertedArrayElements(int[] array) {
        System.out.println("Вывод элементов массива в строку в обратном порядке.");
        int i = array.length - 1;
        StringBuilder arrayStr = new StringBuilder();
        while (i >= 0) {
            arrayStr.append(array[i]).append("\t");
            i--;
        }
        System.out.println(arrayStr);
    }
}
