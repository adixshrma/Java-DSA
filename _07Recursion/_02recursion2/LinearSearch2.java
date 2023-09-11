package _07Recursion._02recursion2;

import java.util.ArrayList;

public class LinearSearch2 {
    public static void main(String[] args) {
        int[] arr = {5,8,6,5,5,5,7,4,3,2,1};
        System.out.println(linear(arr, 5,0));
    }
    // In this program we will neither use external ArrayList anywhere nor take it in argument
    // instead we will create inside of method.

    static ArrayList linear(int[] arr, int key, int index){     // It's not optimised, just for concepts and further use.
        ArrayList <Integer> list = new ArrayList<> ();
        if(index == arr.length){
            return list;
        } if (arr[index] == key){
            list.add(index);
        }
        ArrayList <Integer> ansFromAll = linear(arr, key, index +1);
        list.addAll(ansFromAll);
        return list;
    }
}
