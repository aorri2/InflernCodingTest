import java.util.Scanner;

//팰린드롬
public class inflern01_8 {
    public static String solution(String s){
        String answer = "NO";

        s=s.toUpperCase().replaceAll("[^A-Z]",""); //[^A-Z} ^는 부정, 위 정규식은 알파벳이 아니면 이라는 뜻
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer = "YES";

        return answer;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(solution(str));
    }
}
