public class Main {
    public static void main(String[] args) {
        findPrimes(13);
        System.out.println(findEkub(200, 113));
        System.out.println(findEkuk(24, 13));
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


    public static int findEkub(int n, int k) {
        while (k != 0) {
            int temp = k;
            k = n % k;
            n = temp;
        }
        return n;
    }

    public static int findEkuk(int n, int k) {
        return (n * k) / findEkub(n, k);
    }
}
