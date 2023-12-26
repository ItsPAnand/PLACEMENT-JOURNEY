package HackerRank;

import java.util.*;
import java.lang.*;

public class RailwayTimeFormat {
    public static void main(String[] args) {
        String S="12:40:03PM";       // 06:40:03AM
        String output=changeIntoRailwayTime(S);
        System.out.println(output);
    }

    private static String changeIntoRailwayTime(String s) {
        StringBuilder railTime=new StringBuilder();
        String parts[]=s.split(":");
        String sec[]=parts[2].split("");
        int hour=Integer.parseInt(parts[0]);
        if( sec[2].equalsIgnoreCase("P") && hour>=1 && hour<12 ){
            hour+=12;
            railTime.append(String.valueOf(hour));
            railTime.append(":");
            railTime.append(parts[1]);
            railTime.append(":");
            railTime.append(sec[0]);
            railTime.append(sec[1]);
            return railTime.toString();
        }
        else if( sec[2].equalsIgnoreCase("A") && hour==12){
            hour=00;
            railTime.append(String.valueOf(hour));
            railTime.append(String.valueOf(hour));
            railTime.append(":");
            railTime.append(parts[1]);
            railTime.append(":");
            railTime.append(sec[0]);
            railTime.append(sec[1]);
            return railTime.toString();
        }
        else if( hour>=0 && hour<12 && sec[2].equalsIgnoreCase("A")){
            railTime.append("0");
            railTime.append(String.valueOf(hour));
            railTime.append(":");
            railTime.append(parts[1]);
            railTime.append(":");
            railTime.append(sec[0]);
            railTime.append(sec[1]);
            return railTime.toString();
        }
        railTime.append(String.valueOf(hour));
        railTime.append(":");
        railTime.append(parts[1]);
        railTime.append(":");
        railTime.append(sec[0]);
        railTime.append(sec[1]);
        return railTime.toString();
    }
}
