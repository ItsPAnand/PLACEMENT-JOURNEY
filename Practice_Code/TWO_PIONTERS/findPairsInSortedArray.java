package TWO_PIONTERS;


public class findPairsInSortedArray{
    public static void main(String[] args) {
        int arr[]={1,4,4,5,5,5,6,6,11};
        int k=10;           // output=find the count of pairs that sum to k
        System.out.println(noOfPairs(arr,k));
    }
    public static int noOfPairs(int nums[],int k){
        int start=0,end=nums.length-1;
        int ans=0;

        while(start<end){
            if( (nums[start]+nums[end])<k )
                start++;
            else if( (nums[start]+nums[end])>k )
                end--;
            else if(nums[start]!=nums[end]){
                int c1=0,c2=0;
                int temp=nums[start];
                while( nums[start]==temp ){
                    c1++;
                    start++;
                }
                temp=nums[end];
                while(nums[end]==temp ){
                    c2++;
                    end--;
                }
                ans=ans+(c1*c2);
            }
            else{
                ans=ans+(end-start+1);
                start++;
                end--;

            }
        }
        return ans;
    }
}