import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;
public class Task3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int cout = n;
        TreeSet<Integer> intSet = new TreeSet();
        intSet.add(n);
        while(n!=0){
            intSet.add(n);
            n = in.nextInt();
            cout += n;
        }
        for(int i=0; i<(intSet.size()); i++){
            if ((Collections.max(intSet)* Collections.max(intSet)) >cout){
                intSet.remove(Collections.max(intSet));
            }
        }
        System.out.println(Collections.max(intSet));
    }
}