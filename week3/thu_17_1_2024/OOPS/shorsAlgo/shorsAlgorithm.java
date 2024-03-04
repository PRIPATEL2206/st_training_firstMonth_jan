package shorsAlgo;
import java.math.BigInteger;
import java.util.Random;

public class shorsAlgorithm {
    private static BigInteger N; 

    public static void main(String[] args) {
        N = new BigInteger("15"); 
        BigInteger factor = findFactor(N);
        System.out.println("A non-trivial factor of " + N + " is: " + factor);
    }

    private static BigInteger findFactor(BigInteger N) {
        while (true) {
            BigInteger a = new BigInteger(N.bitLength(), new Random());
            BigInteger gcd = a.gcd(N);

            if (!gcd.equals(BigInteger.ONE)) {
                return gcd;
            }

            
            int r = findPeriod(a, N);

            if (r % 2 == 1 || a.modPow(BigInteger.valueOf(r / 2), N).equals(N.subtract(BigInteger.ONE))) {
                continue;
            }

            
            BigInteger factor1 = a.modPow(BigInteger.valueOf(r / 2), N).subtract(BigInteger.ONE).gcd(N);
            BigInteger factor2 = a.modPow(BigInteger.valueOf(r / 2), N).add(BigInteger.ONE).gcd(N);

            return (factor1.equals(BigInteger.ONE) || factor1.equals(N)) ? factor2 : factor1;
        }
    }

    private static int findPeriod(BigInteger a, BigInteger N) {
      
        int r = 1;
        BigInteger value = a.mod(N);
        while (!value.equals(BigInteger.ONE)) {
            value = value.multiply(a).mod(N);
            r++;
        }
        return r;
    }
}
