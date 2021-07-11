import java.util.*;
public class Main{


    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int val = 0;
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            val = scanner.nextInt();
            a[i] = val;
        }
        scanner.close();
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}