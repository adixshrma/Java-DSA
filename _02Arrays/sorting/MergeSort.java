package _02Arrays.sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {9,8,7,5,3,2,1};

//        int[] ans = mergeSort(arr);                   // this creates new array.
//        System.out.println(Arrays.toString(ans));

        mergeSort1(arr, 0, arr.length);                // this is inline sorting.
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;
        int [] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int [] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    private static int[] merge(int[] first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while( i < first.length && j < second.length){
            if (first[i] < second[j]){
                mix[k] = first[i];
                i++;
            } else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

    static void mergeSort1(int[] arr, int s, int e){        // in line sorting
        if(e - s == 1){     // this means only one element is left.
            return;
        }
            int m = (s + e) / 2;
            mergeSort1(arr, s, m);
            mergeSort1(arr, m, e);

            merge1(arr, s, m, e);

    }

    private static void merge1(int[] arr, int s, int m, int e) {
        int [] mix = new int[e - s];
        int i = s;
        int j = m;
        int k = 0;

        while(i < m && j < e){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }
        // it may be possible that any one of array contain more elements than other one.
        // hence we will put remaining in the mix array.
        while(i< m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j< e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for (int l = 0; l < mix.length ; l++) {
            arr[s+l] = mix[l];
        }
    }


}

