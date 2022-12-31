import java.util.Scanner;

public class Main {

    public int solution(String s, char c) {
        int answer = 0;
        s = s.toUpperCase();
        c = Character.toUpperCase(c);
        for (char x : s.toCharArray())
        {
            if (x == c) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char c = sc.next().charAt(0);
        System.out.println(T.solution(s, c));
    }
}
