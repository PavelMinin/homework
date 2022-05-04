package home_work_2.arrays.new_version;

import home_work_2.arrays.new_version.api.IArraysOperation_new;

// Наследуем класс от интерфейса IArraysOperation и реализуем все его методы используя for
public class ForOperation_new implements IArraysOperation_new {
    @Override
    public String getArrayElements(int[] array) {
        if(array == null) return null;
        if(array.length == 0) return "";

        StringBuilder arrayStr = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            arrayStr.append(array[i]).append("\t");
        }
        return arrayStr.toString();
    }

    @Override
    public String getEachSecondArrayElement(int[] array) {
        if(array == null) return null;
        if(array.length == 0) return "";

        StringBuilder arrayStr = new StringBuilder();
        for(int i = 0; i < array.length; i++) {
            if ((i+1) % 2 == 0){
                arrayStr.append(array[i]).append("\t");
            }
        }
        return arrayStr.toString();
    }

    @Override
    public String getInvertedArrayElements(int[] array) {
        if(array == null) return null;
        if(array.length == 0) return "";

        StringBuilder arrayStr = new StringBuilder();
        for(int i = array.length - 1; i >= 0; i--) {
            arrayStr.append(array[i]).append("\t");
        }
        return arrayStr.toString();
    }
}
