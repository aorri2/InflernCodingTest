import java.util.Scanner;

public class inflern01_9 {
    public static int solution(String str){

        //알파벳 제거
        str = str.toLowerCase().replaceAll("[a-z]","");

        //


        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(solution(str));
    }
}
