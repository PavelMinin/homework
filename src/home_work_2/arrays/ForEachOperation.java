package home_work_2.arrays;

// Наследуем класс от интерфейса IArraysOperation и реализуем все его методы используя foreach
public class ForEachOperation implements IArraysOperation {
    @Override
    public void showArrayElements(int[] array) {
        System.out.println("Вывод каждого элемента массива в строку.");
        StringBuilder arrayStr = new StringBuilder();
        for(int j : array) {
            arrayStr.append(j).append("\t");
        }
        System.out.println(arrayStr);
    }

    @Override
    public void showEachSecondArrayElement(int[] array) {
        System.out.println("Вывод каждого второго элемента массива в строку.");
        StringBuilder arrayStr = new StringBuilder();
        int i = 0;
        for(int j : array) {
            if ((i+1) % 2 == 0) {
                arrayStr.append(j).append("\t");
            }
            i++;
        }
        System.out.println(arrayStr);
    }

    @Override
    public void showInvertedArrayElements(int[] array) {
        System.out.println("Вывод элементов массива в строку в обратном порядке.");
        StringBuilder arrayStr = new StringBuilder();
        for(int j : array) {
            arrayStr.insert(0, j + "\t"); // Добавляем в положение 0 (начало строки) текущее значение элемента массива
        }
        System.out.println(arrayStr);
    }
}
