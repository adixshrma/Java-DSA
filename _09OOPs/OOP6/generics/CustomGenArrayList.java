package _09OOPs.OOP6.generics;
// https://docs.oracle.com/javase/tutorial/java/generics/restrictions.html

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private final static int DEFAULT_SIZE = 10;
    private int size;       // also represent index.
    public CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
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
        CustomGenArrayList<Integer> list = new CustomGenArrayList<>();
        for (int i = 0; i < 15; i++) {
            list.add(i * 2);
        }
        System.out.println(list);

        CustomGenArrayList<String> list2 = new CustomGenArrayList<>();
        list2.add("aditya");
        list2.add("ravi");
        list2.add("vikas");
        System.out.println(list2);
    }
}
