package _02Arrays.questions;

// its giving corrrect ans but time limit is exceeded... Find a way to reduce time complexity...

public class MaxWater {
    public static void main(String[] args) {
        int [] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(waterHold(height));
        
    }
    static int waterHold( int[] height){
        int ans = 0;
        int area = 0;
       for (int i = 0; i < height.length; i++) {
        for (int j = i + 1; j < height.length; j++) {
            if(height[j] > height[i]){
                area = height[i] * (j - i);
                if(area > ans){
                    ans = area;
                }
            }
            else if(height[i] > height[j]){
                area = height[j] * (j-i);
                if(area > ans){
                    ans = area;
                }
            }
            else{
                area = height[i] * (j-i);
                if(area > ans){
                    ans = area;
                }
            }
        }
       }
       return ans;
    }
    
}
