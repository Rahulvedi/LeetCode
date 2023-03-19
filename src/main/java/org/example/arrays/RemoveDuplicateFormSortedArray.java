package org.example.arrays;

public class RemoveDuplicateFormSortedArray {
    public static void main(String[] args) {
        int[] arr=new int[]{0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(arr);
        ArrayUtils.display(arr);
    }
    public static int removeDuplicates(int[] nums) {
        int first=0,second=0;
        while (first<nums.length && second<nums.length){
            if(nums[first]!=nums[second]){
                first++;
                nums[first]=nums[second];
                second++;
            }else {
                second++;
            }
        }
        return (first+1);
    }
}
