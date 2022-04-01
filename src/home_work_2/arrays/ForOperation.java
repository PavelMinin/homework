package home_work_2.arrays;

// Наследуем класс от интерфейса IArraysOperation и реализуем все его методы используя for
public class ForOperation implements IArraysOperation {
    @Override
    public void showArrayElements(int[] array) {
        System.out.println("Вывод каждого элемента массива в строку.");
        StringBuilder arrayStr = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            arrayStr.append(array[i]).append("\t");
        }
        System.out.println(arrayStr);
    }

    @Override
    public void showEachSecondArrayElement(int[] array) {
        System.out.println("Вывод каждого второго элемента массива в строку.");
        StringBuilder arrayStr = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            if ((i+1) % 2 == 0){
                arrayStr.append(array[i]).append("\t");
            }
        }
        System.out.println(arrayStr);
    }

    @Override
    public void showInvertedArrayElements(int[] array) {
        System.out.println("Вывод элементов массива в строку в обратном порядке.");
        StringBuilder arrayStr = new StringBuilder();
        for(int i = array.length - 1; i >= 0; i--) {
            arrayStr.append(array[i]).append("\t");
        }
        System.out.println(arrayStr);
    }
}
