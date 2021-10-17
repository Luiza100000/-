import java.util.Scanner;
public class task9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=n;
        int b=1;
        int cout=0;
        boolean Polindrom =true;
        while(a>10){
            a=a/10;
            cout+=1;
            b=b*10;
        }
//        b/=10;
        for (int i=1; i<cout/2; i++){
            if (n/b!=n%10){
                Polindrom=false;
                break;
            }
            n=n%b/10;
        }
        if (Polindrom==false){
            System.out.println("no");
        }
        else{
            System.out.println("yes");
        }
    }
}
