import java.util.Locale;
import java.util.Scanner;

public class bj11005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int B = sc.nextInt();
        String s = Integer.toString(N, B);
        System.out.println(s.toUpperCase());

    }
}
