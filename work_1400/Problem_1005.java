import java.util.Scanner;

public class Problem_1005 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        for(int cnt=0;cnt<n;cnt++){
            int a = cin.nextInt();
            int b = cin.nextInt();
            String[][] dna=new String[40][40];
            for(int i = 1;i < a/2+1;i++) {
                dna[i][0]="X" + " ".repeat(a-2*i) + "X\n";
            }
            for(int i = 0;i<b;i++){
                for(int l=0;l<a/2+1;l++){
                    for(int m=0;m<39;m++){
                        System.out.printf(dna[l][m]);
                    }
                }
                for(int l=a/2-1;i>0;i++) {
                    for(int m=0;m<39;m++){
                        System.out.printf(dna[l][m]);
                    }
                }
            }
            System.out.printf(dna[0][0]);
        }
    }
}
