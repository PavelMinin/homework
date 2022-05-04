package home_work_2.arrays.new_version;

import home_work_2.arrays.new_version.api.IArraysOperation_new;

// Наследуем класс от интерфейса IArraysOperation и реализуем все его методы используя while
public class WhileOperation_new implements IArraysOperation_new {
    @Override
    public String getArrayElements(int[] array) {
        if(array == null) return null;
        if(array.length == 0) return "";

        int i=0;
        StringBuilder arrayStr = new StringBuilder();
        while (i < array.length) {
            arrayStr.append(array[i]).append("\t");
            i++;
        }
        return arrayStr.toString();
    }

    @Override
    public String getEachSecondArrayElement(int[] array) {
        if(array == null) return null;
        if(array.length == 0) return "";

        int i = 0;
        StringBuilder arrayStr = new StringBuilder();
        while (i < array.length) {
            if ((i+1) % 2 == 0){
                arrayStr.append(array[i]).append("\t");
            }
            i++;
        }
        return arrayStr.toString();
    }

    @Override
    public String getInvertedArrayElements(int[] array) {
        if(array == null) return null;
        if(array.length == 0) return "";

        int i = array.length - 1;
        StringBuilder arrayStr = new StringBuilder();
        while (i >= 0) {
            arrayStr.append(array[i]).append("\t");
            i--;
        }
        return arrayStr.toString();
    }
}
