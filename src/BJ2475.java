import java.util.Scanner;

public class BJ2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp[] = new int[5];

        int result = 0;
        for (int i=0; i<5; i++){
            temp[i] = sc.nextInt();
            temp[i] = temp[i] * temp[i];
            result  = temp[i]+result;

        }
        result = result % 10;

        System.out.println(result);

    }
}
