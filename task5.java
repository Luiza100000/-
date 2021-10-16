import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n2 = 0;
        int length = 0;
        int cout = 0;
        String answer = "";
        for (int i=0; i<n; i++){
            n2 = in.nextInt();
            length = String.valueOf(n2).length();
            cout = (int)(n2 / Math.pow(10, length-1));
            String cout2 = Integer.toString(cout);
            answer += cout2;
        }
        System.out.println(answer);
    }
}
