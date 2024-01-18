package TCS_NQT_Coding;

public class factorialWithoutMul {

    public static void main(String args[]){
        int N=5;
        System.out.println(factWithoutMul(N));
    }
    
    public static int factWithoutMul(int N){
        int ans=N;
        for (int i = N - 1; i > 0; i--) {
            int sum = 0;

            for (int j = 0; j < i; j++){
                sum += ans;
            }
            ans = sum;
        }
        return ans;
    }
}
