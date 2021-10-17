import java.util.Scanner;
public class task8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int dec=2;
        while(n!=1){
            while (n%dec==0){
                n=n/dec;

                System.out.println(dec + "*");
            }
            dec+=1;
        }
    }
}