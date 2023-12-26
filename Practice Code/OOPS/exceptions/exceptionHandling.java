package exceptions;

public class exceptionHandling {
    public static void main(String[] args) {
        int a=10,b=2;
        int c=0;
        try{
            // int arr[]=null;
            // System.out.println(arr[1]);
            c=a/b;
            System.out.println("From try block");
        }
        catch(ArithmeticException e){
            System.err.println("Arithmetic Exception has occured");
        }
        catch(NullPointerException e){
            System.err.println("Null pointer Exception occured");
        }
        catch(Exception e){
            System.err.println("Error occured");
        }
        System.out.println(c);

        double balance=500,withDraw=700;
        try{
            if(balance<withDraw){
                throw new InsufficientFundException(withDraw-balance);
            }
        }
        catch(InsufficientFundException e){
            System.err.println("Not enogh money");
        }


        System.out.println("End of the program");
    }
}
