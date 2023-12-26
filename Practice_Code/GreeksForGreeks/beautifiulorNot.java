import java.util.HashSet;

public class beautifiulorNot {
    public static boolean isBeautiful(int N){
        HashSet<Integer> H=new HashSet<>();
        while(true){
            N=squareNumber(N);
            if(N==1)
                return true;
            if(H.contains(N))
                return false;
            H.add(N);
        }
    }

    public static int squareNumber(int N){
        double numSquare=0;
        while(N>0){
            numSquare=numSquare+Math.pow((double)N%10,2);
            N/=10;
        }
        // System.out.println(numSquare);
        return (int)numSquare;
    }

    public static void main(String[] args) {
        int n=19;
        if(isBeautiful(n))
            System.out.println("This number is beautiful");
        else
        System.out.println("This number is not beautiful");
    }
}
