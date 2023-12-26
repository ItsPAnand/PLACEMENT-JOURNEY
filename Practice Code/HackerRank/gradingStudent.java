package HackerRank;

import java.util.*;

import java.util.ArrayList;


public class gradingStudent {
    public static void main(String[] args) {
        ArrayList<Integer> grades=new ArrayList<>();
        grades.add(4);
        grades.add(73);
        grades.add(67);
        grades.add(38);
        grades.add(33);
        System.out.println("Before rounding up the marks\n"+grades);
        System.out.println("After rounding up the marks\n"+gradingStudents(grades)); 
    }

    public static List<Integer> gradingStudents(List<Integer> grade){
        ArrayList<Integer> result=new ArrayList<>();
        for(int i:grade){
            if(i<38)
                result.add(i);
            else{
                int temp1=i+1;
                int temp2=i+2;
                if(temp1%5==0)
                    result.add(temp1);
                else if(temp2%5==0)
                    result.add(temp2);
                else
                    result.add(i);
            }
        }
        return result;
    }
}
