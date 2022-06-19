import java.util.Scanner;

public class bj2745 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String OctalNum = sc.nextLine();
        int DecimalNum = Integer.parseInt(OctalNum,8);
        String BinaryNum = Integer.toString(DecimalNum,2);
        System.out.println(BinaryNum);
    }
}
