public class Main {
    public static void main(String[] args) {
        findPrimes(13);
        findEkub(200, 113);
        findEkuk(24, 13);
    }

    public static void findPrimes(int n) {
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }
        System.out.println();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void findEkub(int n, int k) {
        while (n != k) {
            if (n > k) {
                n = n - k;
            } else {
                k = k - n;
            }
        }
        System.out.println(n);
    }

    public static void findEkuk(int n, int k) {

    }
}
