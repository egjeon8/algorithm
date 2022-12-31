import java.util.Scanner;

public class Main {

    public String solution(String s) {
        String answer = "";
        for (char x : s.toCharArray())
        {
            if (Character.isUpperCase(x)) answer += Character.toLowerCase(x);
            else answer += Character.toUpperCase(x);
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }
}
