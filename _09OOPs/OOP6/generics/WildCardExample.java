package _09OOPs.OOP6.generics;

import java.util.Arrays;
import java.util.List;

// here T should be either a Number or subclass of Number.
public class WildCardExample<T extends Number> {
    private Object[] data;          // we have created object of Object Class, every class inherits from object class.
    private final static int DEFAULT_SIZE = 10;
    private int size;       // also represent index.
    public WildCardExample(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void getList(List<? extends Number> list){       // Note:- List<Number> list  is more restricted.
        // do something here
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull() {
        return size == data.length;
    }
    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public void set(int index, T num){
        data[index] = num;
    }
    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildCardExample<Integer> list = new WildCardExample<>();
    }
}
