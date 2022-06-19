import java.util.Scanner;

public class bj10988 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        String sReverse = sb.reverse().toString();
        if(s.equals(sReverse)){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
