import java.lang.Math;

 class Solution {
    static boolean isPrime(int num) {
        int i = 2;
        if ( num < 2 ) {
            return false;
        }
        else if ( num < 4 ) {
            return true;
        }

        while (i <= Math.sqrt(num)) {
            if ( num%i == 0 ) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args)
    {
        System.out.println(Solution.isPrime(2)); //-> true
        System.out.println(Solution.isPrime(0)); //-> false
        System.out.println(Solution.isPrime(1)); //-> false
        System.out.println(Solution.isPrime(31)); //-> true
        System.out.println(Solution.isPrime(6)); //-> false
        System.out.println(Solution.isPrime(7)); //-> true
        System.out.println(Solution.isPrime(23)); //-> true
    }
}
