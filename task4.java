import java.util.Scanner;
import java.util.Collections;
import java.util.TreeSet;
public class task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cout = n;
        TreeSet<Integer> intSet = new TreeSet();
        intSet.add(n);
        while(n!=0){
            intSet.add(n);
            n = in.nextInt();
            cout+=n;
//            System.out.println(intSet);
        }
        for(int i=0; i<5; i++){
            Collections.max(intSet);
            System.out.println(Collections.max(intSet));
            intSet.remove(Collections.max(intSet));
        }
//        System.out.println(Collections.max(intSet));
//        System.out.println(cout);
    }
}