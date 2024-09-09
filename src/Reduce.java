public class Reduce {
    public static void main(String[] args) {

        reduceIt(100);
        }
    public static void reduceIt(int n) {
        int count = 0;
        int k = n;
        while (k != 0) {
            if (k%2 == 0) {
                k = k/2;
            } else {
                k = k - 1;
            }
            count++;
        }
        System.out.println(count);
    }
    }
