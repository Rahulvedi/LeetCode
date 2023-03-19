package org.example.arrays;

public class MaximumDifference {  //Stock buy and sell I
    public static void main(String[] args) {
        int[] arr=new int[]{1,5,3,8,12};
        System.out.println(MaximumDifferenceII(arr));
    }
    public static int MaximumDifferenceNavieMethod(int[] arr){   //Stock buy and sell I   //TimeComplexity => O(n^2)  SpaceComplexity => O(1)
        int maxDifference=Integer.MIN_VALUE;
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j< arr.length;j++){
                if(maxDifference<arr[j]-arr[i]) maxDifference=arr[j]-arr[i];
            }
        }
        return maxDifference;
    }
    public static int MaximumDifferenceOptimizeMethod(int[] arr){ //Stock buy and sell I   //TimeComplexity => O(n)  SpaceComplexity => O(1)
        int maxDifference=Integer.MIN_VALUE;
        int smallest=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]-smallest>maxDifference) maxDifference=arr[i]-smallest;
            if(arr[i]<smallest) smallest=arr[i];
        }
        return maxDifference;
    }

    public static int MaximumDifferenceII(int arr[]){
        int maxProfit=0;
        for(int i=1;i< arr.length;i++){
            if(arr[i]>arr[i-1]) maxProfit=maxProfit+arr[i]-arr[i-1];
        }
        return maxProfit;
    }
}
