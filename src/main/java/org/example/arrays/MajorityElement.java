package org.example.arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr=new int[]{3,2,3};
        System.out.println(majorityElementOptimizedMethod(arr));
    }
    public static int majorityElementNaiveMethod(int[] arr){
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]) count++;
            }
            if(count>=arr.length/2) return arr[i];
        }
        return -1;
    }
    public static int majorityElementOptimizedMethod(int[] arr){
        int count=1;
        int Candidate=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]==Candidate) count++;
            else count--;
            if(count==0) {
                Candidate=arr[i];
                count=1;
            }
        }
        return Candidate;
    }
}
