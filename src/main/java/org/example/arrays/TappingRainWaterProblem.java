package org.example.arrays;

public class TappingRainWaterProblem {
    public static void main(String[] args) {
        int[] arr=new int[]{5,0,6,2,3};
        System.out.println(tappingRainWaterOptimizeMethod(arr));
    }
    public static int tappingRainWaterNaiveMethod(int[] arr){
        int storedWater=0;
        for(int i=1;i< arr.length-1;i++){
            int leftMax=arr[i];
            for(int j=0;j<i;j++){
                leftMax=Math.max(leftMax,arr[j]);
            }
            int rightMax=arr[i];
            for(int j=i+1;j< arr.length;j++){
                rightMax=Math.max(rightMax,arr[j]);
            }
            storedWater=storedWater+(Math.min(leftMax,rightMax)-arr[i]);
        }
        return storedWater;
    }
    public static int tappingRainWaterOptimizeMethod(int[] arr){
        int storedWater=0;
        int[] leftMax = new int[arr.length];
        int[] rightMax= new int[arr.length];
        leftMax[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            leftMax[i]=Math.max(arr[i],leftMax[i-1]);
        }
        rightMax[arr.length-1]=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--){
            rightMax[i]=Math.max(arr[i],rightMax[i+1]);
        }
        for(int i=1;i<arr.length-1;i++){
            storedWater=storedWater+Math.min(leftMax[i],rightMax[i])-arr[i];
        }
        return storedWater;
    }
}
