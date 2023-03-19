package org.example.arrays;

public class LeaderOfArray {
    public static void main(String[] args) {
        int[] arr=new int[]{7,10,4,3,6,5,2};
        leaderOfArrayOptimizeMethod(arr);
    }
    public static void leaderOfArrayNaiveMethod(int[] arr){
        for(int i=0;i< arr.length;i++){
            int j;
            for( j=i+1;j< arr.length;j++){
                if(arr[i]<=arr[j]) break;
            }
            if(j== arr.length) System.out.println(arr[i]);
        }
    }
    public static void leaderOfArrayOptimizeMethod(int[] arr){
        int currentLeader=arr[arr.length-1];
        System.out.println(currentLeader);
        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>currentLeader){
                currentLeader=arr[i];
                System.out.println(currentLeader);
            }
        }
    }
}
