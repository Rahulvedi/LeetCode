package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = new int[]{9,9,9};
        int[] result=plusOneNaiveMethod(arr);
        ArrayUtils.display(result);
    }

    public static int[] plusOneNaiveMethod(int[] arr) {
        int cary=0;
        int iterator=arr.length-1;
        do{
            cary=(arr[iterator]+1)>=10?1:0;
            arr[iterator]=(arr[iterator]+1)%10;
            iterator--;
        }while (cary!=0 && iterator>=0);
        if(cary!=0){
            int tempArr[]=new int[arr.length+1];
            tempArr[0]=1;
            for(int i=1;i<tempArr.length;i++){
                tempArr[i]=arr[i-1];
            }
            return tempArr;
        }
        return arr;
    }
}
