import java.math.BigInteger;
import java.util.Scanner;

public class Problem_1736 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int a = cin.nextInt();
        int[] arr = new int[10000];
        for (int i = 2; i < 100; i++) {
            if (arr[i] == 1) continue;
            for (int x = 2 * i; x < 10000; x += i) {
                arr[x] = 1;
            }
        }
        while (a-- > 0) {
            int rst = 0;
            int n = cin.nextInt();
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (arr[i] == 1 || arr[n / i] == 1) continue;
                if (n % i == 0) {
                    rst = 1;

                }
            }
            if (rst == 1) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}
