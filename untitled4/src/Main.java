public class Main {
    public static void main(String[] args) {
        findPrimes(13);
        findEkub(200, 113);
        findEkuk(24, 13);
    }

    public static void findPrimes(int n) {

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
