package org.example.arrays;

public class MaxConsecutive1inBinaryArray {
    public static void main(String[] args) {
        int[] arr=new int[]{1,1,0,1,1,1};
        System.out.println(maxConsecutive1s(arr));
    }
    public static int maxConsecutive1s(int[] arr){
        int maxCount=0,iterationCount=0;
        for(int num : arr){
            if(num==1){
                iterationCount++;
            }else{
                maxCount=Math.max(iterationCount,maxCount);
                iterationCount=0;
            }
        }
        maxCount=Math.max(iterationCount,maxCount);
        return maxCount;
    }
}
