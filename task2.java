import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double cout;
        int minimum;
        int maximum;
        int prom= in.nextInt();
        minimum=prom;
        maximum=prom;
        cout=prom;
        for (int i=1; i<n; i++){
            prom = in.nextInt();
            if (prom>maximum){
                maximum=prom;
            }
            if (prom<minimum){
                minimum=prom;
            }
            cout += prom;
        }
        System.out.println(maximum);
        System.out.println(minimum);
        System.out.println(cout/n);
    }
}
