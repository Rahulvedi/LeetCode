package org.example.arrays;

public class MaximumLengthOfEvenOddSubArray {
    public static void main(String[] args) {
            int[] arr=new int[]{7,10,13,14};
        System.out.println(maximumLengthOfEvenOddSubArrayOptimized(arr));
    }
    public static int maximumLengthOfEvenOddSubArrayNaive(int[] arr){
        int maxlength=1;
        for(int i=0;i<arr.length;i++){
            int length=1;
            for(int j=i+1;j<arr.length;j++){
                if((arr[j-1]%2==0 &&arr[j]%2!=0)||(arr[j-1]%2!=0 &&arr[j]%2==0)) length++;
                else break;
            }
            maxlength=Math.max(maxlength,length);
        }
        return maxlength;
    }
    public static int maximumLengthOfEvenOddSubArrayOptimized(int[] arr){
        int maxLength=1;
        int length=1;
        for(int j=1;j<arr.length;j++){
            if((arr[j-1]%2==0 &&arr[j]%2!=0)||(arr[j-1]%2!=0 &&arr[j]%2==0)) length++;
            else length=1;
            maxLength=Math.max(maxLength,length);
        }
        return maxLength;
    }
}
