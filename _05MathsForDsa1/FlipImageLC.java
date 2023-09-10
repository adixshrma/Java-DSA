package _05MathsForDsa1;

public class FlipImageLC {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{0,0,1},{1,1,1}};
        int ans[][] = flipAndInvertImage(arr);
        for(int[] row : ans){
            for (int i = 0; i < ans[0].length; i++) {
                System.out.print(row[i] + " ");
            }
            System.out.println();
        }
    }
    static int[][] flipAndInvertImage( int[][] image){
        for(int[] row :image){
            for(int j = 0; j < (image[0].length +1)/2; j++){
                int temp = row[j] ^1;
                row[j] = row[image.length -1-j] ^1;
                row[image.length -1-j] = temp;
            }
        }
        return image;
    }
}
