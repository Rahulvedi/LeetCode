package org.example.arrays.medium;

import org.example.arrays.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr=new int[][]{{1,3}};
        int[][] result=merge(arr);
    }
    public static int[][] merge(int[][] intervals) {
        List<int[]> returnList = new ArrayList<>();
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int start=intervals[0][0];
        int end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(end>=intervals[i][0]){
                end=Math.max(end,intervals[i][1]);
                continue;
            }
            returnList.add(new int[]{start,end});
            start=intervals[i][0];
            end=intervals[i][1];
        }
        returnList.add(new int[]{start,end});
        return returnList.toArray(new int[returnList.size()][]);
    }
}
