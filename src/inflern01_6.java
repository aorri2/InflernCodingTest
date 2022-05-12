import java.util.Scanner;

public class inflern01_6 {
    public String solution(String str){
        String answer="";
        for(int i=0; i<str.length();i++){
//            System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
            if(i == str.indexOf(str.charAt(i)))
            {
                answer += str.charAt(i);
            }
        }
        return answer;
    }
    public static void main(String[] args){
        inflern01_6 T = new inflern01_6();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.print(T.solution(str));
    }
}
