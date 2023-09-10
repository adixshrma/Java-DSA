package _02Arrays.questions;

public class LC4_median {
    public static void main(String[] args) {
        int [] arr1 = {1,3,5,6,7,8};
        int [] arr2 = {2,4};
        System.out.println(findMedian(arr1, arr2));
     }
    static double findMedian(int[] nums1, int[] nums2) {
        int[] mix = helper(nums1, nums2);
        int mid = mix.length/2;
        if ((mix.length &1) == 1){      // odd
            return mix[mid];
        } else {
            return (double)(mix[mid] + mix[mid-1])/2;
        }
    }
    static int[] helper(int[] nums1, int[] nums2){
        int[] sum = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]){
                sum[k] = nums1[i];
                i++;
            } else{
                sum[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < nums1.length){
            sum[k] = nums1[i];
            i++;
            k++;
        }
        while(j < nums2.length){
            sum[k] = nums2[j];
            j++;
            k++;
        }
        return sum;
    }

}
