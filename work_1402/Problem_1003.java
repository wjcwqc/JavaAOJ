import java.util.ArrayList;
import java.util.Scanner;

public class Problem_1003 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        String str = cin.nextLine();
        System.out.println(str.replace("\\S",""));
    }
}

