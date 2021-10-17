import java.util.Scanner;
public class task6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        int maxValue = 0;
        for(int i = 0; i < n; i++) {
            array[i] = in.nextInt();
            if (array[i] % 100 == 11) {
                if (array[i] > maxValue) {
                    maxValue = array[i];
                }
            }
        }
        System.out.println(maxValue);
    }
}
