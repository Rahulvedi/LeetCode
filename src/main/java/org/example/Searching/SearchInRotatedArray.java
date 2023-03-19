package org.example.Searching;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] arr=new int[]{4,5,6,7,0,1,2};
        System.out.println(searchInRotatedArray(arr,0));
    }
    public static int searchInRotatedArray(int[] arr,int target){
//        int left=0;
//        int right=arr.length;
//        while (left<=right){
//            int mid=left +(right-left)/2;
//            if(arr[mid]==target){
//                return mid;
//            }
//            else if(arr[mid]>arr[left]){
////                Left Postion of Array
//                if(arr[mid]<target || target <arr[0]){
//                    left=mid+1;
//                } else{
//                    right=mid-1;
//                }
//            }else{
////                Right Postion of Array
//                if(arr[mid]>target || target> ){
//                    right=mid-1;
//                }else{
//
//                }
//            }
//        }
        return -1;
    }
}
