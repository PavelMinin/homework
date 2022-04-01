package home_work_2.arrays;

import home_work_2.utils.ArraysUtils;

public class ArraysIteration_2_3 {
    public static void main(String[] args) {
        int[] container = ArraysUtils.arrayFromConsole(); // Ввод данных
        //int[] container = ArraysUtils.arrayRandom(10,20);

        System.out.println("DoWhileOperation\n");
        // Создаем объект класса DoWhileOperation и вызываем все его методы поочередно
        // передавая раннее созданный массив
        DoWhileOperation dwo = new DoWhileOperation();
        dwo.showArrayElements(container);
        dwo.showEachSecondArrayElement(container);
        dwo.showInvertedArrayElements(container);

        System.out.println("\nWhileOperation\n");
        // Создаем объект класса WhileOperation и вызываем все его методы поочередно
        // передавая раннее созданный массив
        WhileOperation wo = new WhileOperation();
        wo.showArrayElements(container);
        wo.showEachSecondArrayElement(container);
        wo.showInvertedArrayElements(container);

        System.out.println("\nForOperation\n");
        // Создаем объект класса ForOperation и вызываем все его методы поочередно
        // передавая раннее созданный массив
        ForOperation fo = new ForOperation();
        fo.showArrayElements(container);
        fo.showEachSecondArrayElement(container);
        fo.showInvertedArrayElements(container);

        System.out.println("\nForEachOperation\n");
        // Создаем объект класса ForEachOperation и вызываем все его методы поочередно
        // передавая раннее созданный массив
        ForEachOperation feo = new ForEachOperation();
        feo.showArrayElements(container);
        feo.showEachSecondArrayElement(container);
        feo.showInvertedArrayElements(container);
    }
}
