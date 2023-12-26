package SkillRack;
import java.util.*;
public class SeriesTeamScore {
    public static void main(String[] args) {
        int resultA=0,resultB=0;
        Scanner sc=new Scanner(System.in);
        String teamA=sc.nextLine();
        String teamB=sc.nextLine();
        String A[]=teamA.split(" ");
        String B[]=teamB.split(" ");
        int scoreA[]=new int[A.length];
        int scoreB[]=new int[B.length];
        for(int i=0;i<A.length;i++){
            scoreA[i]=Integer.parseInt(A[i]);
            scoreB[i]=Integer.parseInt(B[i]);
        }

        for(int i=0;i<scoreA.length;i++){
            if(scoreA[i]==scoreB[i]){
                resultA++;
                resultB++;
            }
            if(scoreA[i]>scoreB[i])
                resultA+=3;
            if(scoreA[i]<scoreB[i])
                resultB+=3;
        }
        System.out.println(resultA+" "+resultB);
    }
}
