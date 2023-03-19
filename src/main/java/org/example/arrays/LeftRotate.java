package org.example.arrays;

import java.security.PublicKey;

public class LeftRotate {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
//        LeftRotate.leftRoateByNumberOptimize(arr,5);
//        LeftRotate.display(arr);
        System.out.println(searchInRotatedSortedArray(arr,0));
    }
    public static void leftRotateByOne(int[] arr){
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
    }
    public static void leftRotateWithNumberNaiveMethod(int[] arr,int N){
        for(int i=0;i<N;i++){
            leftRotateByOne(arr);
        }
    }
    public static void leftRotateWithNumberUsingExtraSpace(int[] arr,int N){
        N=N% arr.length;
        int[] tempArr=new int[N];
        for(int i=0;i< N;i++){
            tempArr[i]=arr[i];
        }
        for(int i=0;i<arr.length-N;i++){
            arr[i]=arr[N+i];
        }
        for(int i=0;i< tempArr.length;i++){
            arr[N+i+1]=tempArr[i];
        }

    }
    public static void leftRoateByNumberOptimize(int[] arr,int N){
        N=N% arr.length;
        reverseArray(arr,0,N-1);
        reverseArray(arr,N, arr.length-1);
        reverseArray(arr,0, arr.length-1);
    }
    public static void reverseArray(int[] arr, int beg,int end){
        while(beg < end){
            int temp=arr[beg];
            arr[beg]=arr[end];
            arr[end]=temp;
            beg++;
            end--;
        }
    }
    public static void display(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }
    }
    public static int searchInRotatedSortedArray(int[] nums,int target){
        int pivot=0;

        return -1;
    }
}
