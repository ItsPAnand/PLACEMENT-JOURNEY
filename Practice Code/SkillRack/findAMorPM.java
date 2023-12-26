package SkillRack;

import java.util.*;

public class findAMorPM {
    public static void main(String[] args) {
        String time="24:59";
        String parts[]=time.split(":");
        int hours=Integer.parseInt(parts[0]);
        int minute=Integer.parseInt(parts[1]);
        if( (hours<=24 && hours>=0) && (minute>=0 && minute<=60) && (hours!=24)){
            if(hours<=24 && hours>=12)
                System.out.println("PM");
            else
                System.out.println("AM");
        }
        else
            System.out.println("INVALID TIME");
    }
}
