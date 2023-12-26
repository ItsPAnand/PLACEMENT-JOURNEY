package SkillRack;

public class digitalSum {
    public static void main(String[] args) {
        long N=8508117878L;
        long sum=digitalsum(N);

        while(sum>9){
            sum=digitalsum(sum);
        }
        System.out.println(sum);
    }

    private static long digitalsum(long n) {
        long temp=0;
        while(n>0){
            temp+=n%10;
            n/=10;
        }
        return temp;
    }
}
