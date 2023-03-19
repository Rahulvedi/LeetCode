package org.example.arrays;

public class MovesZeroesToEnd {
    public static void main(String[] args) {
        int[] arr=new int[]{0,1,0,4,0,3,0,4,0,0};
        moveZeroesToEnd(arr);
        display(arr);
    }
    public static void moveZeroesToEnd(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                swap(arr,count,i);
                count++;
            }
        }
    }
    public static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void display(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }
    }
}
