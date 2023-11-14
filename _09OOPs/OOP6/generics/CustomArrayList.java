package _09OOPs.OOP6.generics;

import java.util.Arrays;

// we have created a custom ArrayList here.
public class CustomArrayList {
    private int[] data;
    private final static int DEFAULT_SIZE = 10;
    private int size;       // also represent index.
    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }
    private void resize() {
        int[] temp = new int[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull() {
        return size == data.length;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public void set(int index, int num){
        data[index] = num;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
//        list.add(1);
//        list.add(3);
//        list.add(5);
        for (int i = 0; i < 15; i++) {
            list.add(i * 2);
        }
        list.set(17,45);
        list.set(18,89);
        System.out.println(list.get(5));
        System.out.println(list);
    }
}
// here, the problem is, we can't use this for strings, or simply other data types.
// because we have created this for Integer, if we want to use String, we have to create it separately
// this will cause repetition, GENERICS solve this problem. (generic eg - <Integer> )
