import java.util.Scanner;

public class strFind {

    public int solution(String str, char t){
        int answer= 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for(int i=0; i<str.length();i++){
            if(str.charAt(i) == t){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        strFind strfind = new strFind();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        System.out.print(strfind.solution(str,c));

    }
}
