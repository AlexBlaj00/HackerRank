import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < n; i++) {
           array.add(scanner.nextInt());
        }
        int q = scanner.nextInt();
        int i=0;
        String arg = null;
        while ( i < q) {
            arg = scanner.next();
            if (arg.equals("Insert")) {
                int index = scanner.nextInt();
                int nr = scanner.nextInt();
                array.add(index, nr);
            }
            else
            {
                int index = scanner.nextInt();
                array.remove(index);
            }
            i++;
        }
        scanner.close();
        for (int j = 0; j < array.size(); j++) {
            System.out.print(array.get(j) + " ");
        }
    }
}
