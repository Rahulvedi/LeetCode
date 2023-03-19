package org.example.arrays;

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int[] arr=new int[]{5,-2,3,4};
        System.out.println(maxCircularSumOfSubArrayOptimizedMethod(arr));
    }
    public static int maxSumOfSubArrayNaiveMethod(int[] arr){ //TimeComplexity : O(n^2)
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                maxSum=Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
    public static int maxProductOfSubArrayNaiveMethod(int[] arr){ //TimeComplexity : O(n^2)
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=1;
            for(int j=i;j<arr.length;j++){
                sum=sum*arr[j];
                maxSum=Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
    public static int maxSumOfSubArrayOptimizedMethod(int[] arr){
        int maxEnding=arr[0];
        int maxSum=arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnding=Math.max(maxEnding+arr[i],arr[i]);
            maxSum=Math.max(maxSum,maxEnding);
        }
        return maxSum;
    }
    public static int maxProductOfSubArrayOptimizedMethod(int[] arr){
        int maxEnding=arr[0];
        int minEnding=arr[0];
        int maxProduct=arr[0];
        for(int i=1;i<2*arr.length-1;i++){
            int tempMaxEnding=maxEnding;
            maxEnding=Math.max(Math.max(maxEnding*arr[i],minEnding*arr[i]),arr[i]);
            minEnding=Math.min(Math.min(tempMaxEnding*arr[i],minEnding*arr[i]),arr[i]);
            maxProduct=Math.max(maxProduct,maxEnding);
        }
        return maxProduct;
    }
    public static int maxCircularSumOfSubArrayOptimizedMethod(int[] arr){
        return 0;
    }
}
