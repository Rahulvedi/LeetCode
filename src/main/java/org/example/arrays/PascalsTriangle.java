package org.example.arrays;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.println(genrate(22));
    }
    public static List<List<Integer>> genrate(int rows){
        List<List<Integer>> returnList=new ArrayList<>();
        for(int row=1;row<=rows;row++){
            List<Integer> sublist=new ArrayList<>();
            if(row==1){
                sublist.add(1);
            }
            else if(row==2){
                sublist.add(1);
                sublist.add(1);
            }
            else{
                sublist.add(1);
                for(int i=2;i<row;i++){
                    int previousRow=row-2;
                    int temp=returnList.get(previousRow).get(i-2)+returnList.get(previousRow).get(i-1);
                    sublist.add(temp);
                }
                sublist.add(1);
            }
            returnList.add(sublist);
        }
        return returnList;
    }
}
