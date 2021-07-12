import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<String> set = new HashSet<>();
        String [] str1 = new String[n];
        String [] str2 = new String[n];
        scanner.nextLine();
        for(int i = 0; i< n; i++) {
            str1[i] = scanner.next();
            str2[i] = scanner.next();
        }
        for(int i = 0; i< n; i++) {
            set.add(str1[i] + " " + str2[i]);
            System.out.println(set.size());
        }
        scanner.close();
    }
}
