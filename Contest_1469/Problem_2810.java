import java.util.Scanner;

public class Problem_2810 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        while (n-- > 0) {
            long a = cin.nextLong();
            long b = cin.nextLong();
            int cnt = 0;
            if (b % a == 0) b /= a;

            for (; b % 2 == 0; b /= 2) {
                cnt++;
            }
            for (; b % 3 == 0; b /= 3) {
                cnt++;
            }
            if (b != 1) cnt = -1;
            System.out.println(cnt);

        }

    }

}
