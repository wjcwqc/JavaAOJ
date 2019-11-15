import java.math.BigInteger;
import java.util.Scanner;

public class Problem_3037 {
    static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            long sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += cin.nextLong();
            }
            System.out.println(sum);
        }
    }

}


