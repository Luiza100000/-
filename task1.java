import java.util.Scanner;
public class task1 {
    public static double funt(int n) {
        int num;
        num = 1;
        for (int i = 1; i < n; i++) {
            num = i * i;
            if (num > n) {
                break;
            }
        }
        return Math.sqrt(num)-1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(funt(n));
    }
}
