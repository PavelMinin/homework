package home_work_4.container;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
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
        if(this.data.length == 0 || this.data[this.data.length - 1] != null) {
            this.data = Arrays.copyOf(this.data, data.length + 1);
            this.data[data.length -1] = item;
        } else {
            int i = 0;
            while(this.data[i] != null) {
                i++;
            }
            this.data[i] = item;
        }
        return data.length - 1;
    }

    /**
     * This method gets item from container's cell with passed index and returns it.
     * If cell is empty or doesn't exist, method returns null.
     *
     * @param index index of the requested item.
     * @return item or null, if item doesn't exist.
     */
    public T get(int index) {
        return this.data[index];
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
        } else {
            T[] temp = Arrays.copyOf(this.data, this.data.length - 1);
            for(int i = 0; i < this.data.length; i++) {
                if(i != index) {
                    temp[i] = this.data[i];
                }
            }
            this.data = Arrays.copyOf(temp, temp.length);
            return true;
        }

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("DataContainer { ");
        int i = 0;
        while((this.data[i] != null) || (i < this.data.length)) {
            sb.append(this.data.toString()).append(", ");
        }
        sb.append("}");

        return sb.toString();
    }

    /**
     * This method sorts elements in the container using passed comparator.
     *
     * @param comparator
     */
    public void sort(Comparator comparator) {

    }
}
