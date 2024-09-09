public class Multiples {
    public static void main(String[] args) {
        countMultiples(1000);
    }
    private static void countMultiples(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum ++;
            }
        }
        System.out.println(sum);
    }
}
