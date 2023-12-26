package SkillRack;
import java.util.*;
public class StrictProfessorClassCancellation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        int toatalStrength=6;
        int attendedStudent=4;
        String classStartTime="11:10";
        String studentTime[]={"10:30","10:40","11:55","11:20","11:10","11:12"};
        String time[]=classStartTime.split(":");
        int hour=Integer.parseInt(time[0]);
        int min=Integer.parseInt(time[1]);
        for(String str:studentTime){
            String temp[]=str.split(":");
            int stdHour=Integer.parseInt(temp[0]);
            int stdMin=Integer.parseInt(temp[1]);
            if( stdHour>hour || (hour==stdHour && min<=stdMin) ){
                count++;
            }
        }

        if(count>=attendedStudent)
            System.out.println("yes");
        else
            System.out.println("no");

        sc.close();
    }
}
