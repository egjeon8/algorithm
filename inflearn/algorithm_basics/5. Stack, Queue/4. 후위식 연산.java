import java.util.Scanner;
import java.util.Stack;

public class Main {

    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for (char x : s.toCharArray())
        {
            if (Character.isDigit(x)) stack.push(x - 48);
            else
            {
                int rt = stack.pop();
                int lt = stack.pop();
                if (x == '+') stack.push(lt + rt);
                else if (x == '-') stack.push(lt - rt);
                else if (x == '*') stack.push(lt * rt);
                else if (x == '/') stack.push(lt / rt);
            }
        }
        answer = stack.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(T.solution(s));
    }
}
