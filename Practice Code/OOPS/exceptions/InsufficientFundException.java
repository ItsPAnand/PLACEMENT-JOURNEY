package exceptions;

public class InsufficientFundException extends Exception {
    double amount;
    InsufficientFundException(double amt){
        amount=amt;
    }
}
