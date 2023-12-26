package companyQuestions;

public class equilibriumArrayIndex {
    public static void main(String args[]){
        int arr[]={-7, 1, 5, 2, -4, 3, 0};
        System.out.println("The Equilibrium index is at "+findEquilibrium(arr));
    }

    public static int findEquilibrium(int []arr){
        for(int i=0;i<arr.length;i++){
            int leftSum=0;
            for(int j=0;j<i;j++){
                leftSum+=arr[j];
            }
            int rightSum=0;
            for(int j=i+1;j<arr.length;j++){
                rightSum+=arr[j];
            }
            if(leftSum==rightSum)
                return i;
        }
        return -1;
    }
}
