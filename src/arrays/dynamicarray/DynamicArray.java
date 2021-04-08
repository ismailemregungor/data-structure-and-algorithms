package arrays.dynamicarray;

import java.util.Arrays;

class DynamicArray<T>{

    Object[] data;
    int size;

    public DynamicArray() {
        data = new Object[1];
        size = 0;
    }

    public int getSize() {
        return data.length;
    }

    public T get(int index){
        return (T) data[index];
    }

    public void put(Object element){

        ensureCapacity(size + 1);
        data[size++] = element;

    }

    private void ensureCapacity(int minCapacity) {

        int oldCapacity = getSize();
        if (minCapacity > oldCapacity){

            int newCapacity = oldCapacity*2;

            if (newCapacity<minCapacity){
                newCapacity = minCapacity;
            }

            data = Arrays.copyOf(data,newCapacity);

        }
    }
}
