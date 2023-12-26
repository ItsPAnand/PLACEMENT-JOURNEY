package HackerRank;

import java.util.*;

public class flippingBits {
    public static void main(String[] args) {
        long n=0;
        System.out.println(bitsFlipping(n));
    }

        public static long bitsFlipping(long n) {
            long flippedNumbers ;
            long maxUnsignedValue = (1L << 32) - 1;
            flippedNumbers = n ^ maxUnsignedValue;
            System.out.println(maxUnsignedValue);
            return flippedNumbers;
    }
}
//4294967294 