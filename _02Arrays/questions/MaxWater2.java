package _02Arrays.questions;

public class MaxWater2 {
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(waterHold(height));   
    }
    static int waterHold( int[] height){
        int max = 0;
        int area = 0;
        int i = 0;
        int j = height.length -1;
        while(i < j){
            if ( height[i] < height[j]){
                area = height[i] * (j-i);
                if(area > max){
                    max = area;
                }
                i++;
            } else {
                area = height[j] * (j-i);
                if(area > max){
                    max = area;
                }
                j--;
            }
        }
        return max;
    }
}
