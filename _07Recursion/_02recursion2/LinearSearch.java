package _07Recursion._02recursion2;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,3,2,4,4,5,6,9,8,7};
        ArrayList<Integer> ans = findAllRec1(arr, 4, 0, new ArrayList<>());
        System.out.println(ans);

//        int ans = linear(arr, 7, 0);
//        System.out.println(ans);
//        System.out.println(findAll(arr, 4));
//        findAllRec(arr, 4, 0);
//        System.out.println(list1);
    }
//    static int linear (int [] arr, int key, int index){          // For only one key
//        if (index == arr.length){
//            return -1;
//        }
//        if(arr[index] == key){
//            return index;
//        }
//        return linear(arr, key, index+1);
//    }
//    static ArrayList<Integer> findAll(int [] arr, int key){     // Through Iteration method. (many keys)
//        ArrayList <Integer> list = new ArrayList<>();
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == key){
//                list.add(i);
//            }
//        }
//        return list;
//    }


//    static ArrayList <Integer> list1 = new ArrayList<>();       // Through recursion. (many keys)
//    static void findAllRec(int [] arr, int key, int index){
//        if(index == arr.length){
//            return;
//        } else if(arr[index]== key){
//            list1.add(index);
//        } findAllRec(arr, key, index+1);
//    }


    static ArrayList<Integer> findAllRec1(int [] arr, int key, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        } else if(arr[index]== key){
            list.add(index);
        }
        return findAllRec1(arr, key, index+1, list);
    }

}
