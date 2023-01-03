import java.util.Scanner;

public class Main {

    public String solution(String s) {
        String answer = "";
        int m = Integer.MIN_VALUE;
        for (String x : s.split(" "))
        {
            int len = x.length();
            if (len > m)
            {
                m = len;
                answer = x;
            }
        }
        return answer;
    }

    /*
    public String solution(String s) {
        String answer = "";
        int m = Integer.MIN_VALUE, pos;
        while ((pos = s.indexOf(" ")) != -1)
        {
            String tmp = s.substring(0, pos);
            int len = tmp.length();
            if (len > m)
            {
                m = len;
                answer = tmp;
            }
            s = s.substring(pos + 1);
        }
        if (s.length() > m) answer = s;
        return answer;
    }
    */

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(T.solution(s));
    }
}
