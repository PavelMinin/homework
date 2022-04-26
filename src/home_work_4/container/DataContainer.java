package home_work_4.container;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class DataContainer<T> implements Iterable<T>{

    private T[] data;

    public DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * This method adds the new item to the container.
     *
     * @param item new T for adding.
     * @return index of added item.
     */
    public int add(T item) {
        if(item == null) {
            return -1;
        }

        if(this.data.length == 0 || this.data[this.data.length - 1] != null) {
            this.data = Arrays.copyOf(this.data, data.length + 1);
            this.data[data.length - 1] = item;
            return data.length - 1;
        } else {
            int i = 0;
            while(this.data[i] != null) {
                i++;
            }
            this.data[i] = item;
            return i;
        }
    }

    /**
     * This method gets item from container's cell with passed index and returns it.
     * If cell is empty or doesn't exist, method returns null.
     *
     * @param index index of the requested item.
     * @return item or null, if item doesn't exist.
     */
    public T get(int index) {
        if(index < 0) {
            return null;
        } else if(index < this.data.length) {
            return this.data[index];
        } else {
            return null;
        }
    }

    /**
     * This method returns all items from the container.
     *
     * @return array of items.
     */
    public T[] getItems() {
        return this.data;
    }

    /**
     * This method deletes the item and the cell with passed index.
     * All cells with an index greater than the passed one are shifted to the left.
     * If a cell with the passed index doesn't exist, method return false.
     *
     * @param index index of deleting item.
     * @return true - if item was deleted, or false - if item with passed index doesn't exist.
     */
    public boolean delete(int index) {
        if(index < 0 || index >= this.data.length) {
            return false;
        } else if(this.data[index] == null) {
            System.out.println("Error: item is null.");
            dataCleanUp();
            return false;
        } else {
            T[] temp = Arrays.copyOf(this.data, this.data.length - 1);
            int count = 0;
            for(int i = 0; i < this.data.length; i++) {
                if(i != index) {
                    temp[count] = this.data[i];
                    count++;
                }
            }
            this.data = Arrays.copyOf(temp, temp.length);
            return true;
        }
    }

    /**
     * This method deletes the item and the cell using delete(int index).
     * As index argument, the current value i is passed.
     * @param item element to be deleted.
     * @return true - if the element has been successfully deleted,
     * false - if the element has not been deleted.
     */
    public boolean delete(T item) {

        for (int i = 0; i < this.data.length; i++) {
            if(this.data[i].equals(item) && this.data[i] != null) return delete(i);
        }

        return false;
    }

    /**
     * Method generates a string with content description. Each element on a new line.
     * @return generated string.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DataContainer: {\n");
        int i = 0;
        while(i < this.data.length) {
            if(this.data[i] != null) sb.append(this.data[i].toString()).append(",\n");
            i++;
        }
        sb.append("};");

        return sb.toString();
    }

    /**
     * This method sorts elements in the container using passed comparator.
     * @param comparator to compare elements.
     */
    public void sort(Comparator<T> comparator) {
        int leftBorder = 0;
        int rightBorder = this.data.length - 1;
        boolean wasSorted = true;

        while((leftBorder < rightBorder) && wasSorted) {

            wasSorted = false;

            for(int i = leftBorder; i < rightBorder; i++) {
                if(this.data[i] == null || this.data[i + 1] == null) {
                    throw new NullPointerException("Your array has null elements");
                }
                if(comparator.compare(this.data[i],this.data[i+1]) > 0) {
                    T temp = this.data[i];
                    this.data[i] = this.data[i + 1];
                    this.data[i + 1] = temp;
                    wasSorted = true;
                }
            }
            rightBorder--;

            for(int i = rightBorder; i > leftBorder; i--) {
                if(this.data[i - 1] == null || this.data[i] == null) {
                    throw new NullPointerException("Your array has null elements");
                }
                if(comparator.compare(this.data[i - 1], this.data[i]) > 0) {
                    T temp = this.data[i];
                    this.data[i] = this.data[i - 1];
                    this.data[i - 1] = temp;
                    wasSorted = true;
                }
            }
            leftBorder++;
        }
    }

    /**
     * This method sorts items in the container using implemented method compareTo from
     * objects in a passed DataContainer.
     * @param dataContainer container with objects to be sorted.
     * @param <T> the generic extends Comparable.
     */
    public static <T extends Comparable<T>> void sort(DataContainer<T> dataContainer) {
        int leftBorder = 0;
        int rightBorder = dataContainer.data.length - 1;
        boolean wasSorted = true;

        while((leftBorder < rightBorder) && wasSorted) {

            wasSorted = false;

            for(int i = leftBorder; i < rightBorder; i++) {
                if(dataContainer.data[i] == null || dataContainer.data[i + 1] == null) {
                    throw new NullPointerException("Your object's array has null elements");
                }
                if(dataContainer.data[i].compareTo(dataContainer.data[i+1]) > 0) {
                    T temp = dataContainer.data[i];
                    dataContainer.data[i] = dataContainer.data[i + 1];
                    dataContainer.data[i + 1] = temp;
                    wasSorted = true;
                }
            }
            rightBorder--;

            for(int i = rightBorder; i > leftBorder; i--) {
                if(dataContainer.data[i - 1] == null || dataContainer.data[i] == null) {
                    throw new NullPointerException("Your object's array has null elements");
                }
                if(dataContainer.data[i-1].compareTo(dataContainer.data[i]) > 0) {
                    T temp = dataContainer.data[i];
                    dataContainer.data[i] = dataContainer.data[i - 1];
                    dataContainer.data[i - 1] = temp;
                    wasSorted = true;
                }
            }
            leftBorder++;
        }
    }

    /**
     * This method sorts items in a passed container using a passed comparator.
     * @param dataContainer container with objects to be sorted.
     * @param <T> the generic extends Comparable.
     */
    public static <T extends Comparable<T>> void sort(DataContainer<T> dataContainer, Comparator<T> comparator) {
        int leftBorder = 0;
        int rightBorder = dataContainer.data.length - 1;
        boolean wasSorted = true;

        while((leftBorder < rightBorder) && wasSorted) {

            wasSorted = false;

            for(int i = leftBorder; i < rightBorder; i++) {
                if(dataContainer.data[i] == null || dataContainer.data[i + 1] == null) {
                    throw new NullPointerException("Your object's array has null elements");
                }
                if(comparator.compare(dataContainer.data[i],dataContainer.data[i+1]) > 0) {
                    T temp = dataContainer.data[i];
                    dataContainer.data[i] = dataContainer.data[i + 1];
                    dataContainer.data[i + 1] = temp;
                    wasSorted = true;
                }
            }
            rightBorder--;

            for(int i = rightBorder; i > leftBorder; i--) {
                if(dataContainer.data[i - 1] == null || dataContainer.data[i] == null) {
                    throw new NullPointerException("Your object's array has null elements");
                }
                if(comparator.compare(dataContainer.data[i - 1],dataContainer.data[i]) > 0) {
                    T temp = dataContainer.data[i];
                    dataContainer.data[i] = dataContainer.data[i - 1];
                    dataContainer.data[i - 1] = temp;
                    wasSorted = true;
                }
            }
            leftBorder++;
        }
    }

    /**
     * This class generates class DataContainerIterator instance and returns it.
     * @return class DataContainerIterator instance.
     */
    @Override
    public Iterator<T> iterator() {
        return new DataContainerIterator();
    }

    /**
     * This class implements Iterator interface and overrides hasNext() and next() methods.
     */
    private class DataContainerIterator implements Iterator<T> {
        private int index;

        public DataContainerIterator() {
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
                return get(index) != null;
        }

        @Override
        public T next() throws IndexOutOfBoundsException {
            if(!hasNext()) throw new IndexOutOfBoundsException("End of list.");
            return get(index++);
        }
    }

    /**
     * This method cleans array from the null objects.
     */
    private void dataCleanUp() {
        int count = 0;
        for (T datum : this.data) {
            if(datum != null) count++;
        }

        this.data = Arrays.copyOf(this.data, count);
    }
}
