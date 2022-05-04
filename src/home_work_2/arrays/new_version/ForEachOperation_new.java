package home_work_2.arrays.new_version;

import home_work_2.arrays.new_version.api.IArraysOperation_new;

// Наследуем класс от интерфейса IArraysOperation и реализуем все его методы используя foreach
public class ForEachOperation_new implements IArraysOperation_new {
    @Override
    public String getArrayElements(int[] array) {
        if(array == null) return null;
        if(array.length == 0) return "";

        StringBuilder arrayStr = new StringBuilder();
        for(int j : array) {
            arrayStr.append(j).append("\t");
        }
        return arrayStr.toString();
    }

    @Override
    public String getEachSecondArrayElement(int[] array) {
        if(array == null) return null;
        if(array.length == 0) return "";

        StringBuilder arrayStr = new StringBuilder();
        int i = 0;
        for(int j : array) {
            if ((i+1) % 2 == 0) {
                arrayStr.append(j).append("\t");
            }
            i++;
        }
        return arrayStr.toString();
    }

    @Override
    public String getInvertedArrayElements(int[] array) {
        if(array == null) return null;
        if(array.length == 0) return "";

        StringBuilder arrayStr = new StringBuilder();
        for(int j : array) {
            arrayStr.insert(0, j + "\t"); // Добавляем в положение 0 (начало строки) текущее значение элемента массива
        }
        return arrayStr.toString();
    }
}
