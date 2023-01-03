import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public ArrayList<String> solution(int n, String[] arr) {
        ArrayList<String> answer = new ArrayList<>();
        for (String s : arr)
        {
            char[] x = s.toCharArray();
            int lt = 0, rt = s.length() - 1;
            while (lt < rt)
            {
                char tmp = x[lt];
                x[lt] = x[rt];
                x[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(x);
            answer.add(tmp);
        }
        return answer;
    }

    /*
    public ArrayList<String> solution(int n, String[] arr) {
        ArrayList<String> answer = new ArrayList<>();
        for (String x : arr)
        {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        return answer;
    }
     */

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.next();
        }
        for (String x : T.solution(n, arr))
        {
            System.out.println(x);
        }
    }
}
