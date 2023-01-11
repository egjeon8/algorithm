import java.util.Scanner;

public class Main {

    public int solution(int n, int[][] arr) {
        int answer = Integer.MIN_VALUE;
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++)
        {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++)
            {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(sum1, answer);
            answer = Math.max(sum2, answer);
        }
        sum1 = sum2 = 0;
        for (int i = 0; i < n; i++)
        {
            sum1 += arr[i][i];
            sum2 += arr[i][n - i - 1];
        }
        answer = Math.max(sum1, answer);
        answer = Math.max(sum2, answer);
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
