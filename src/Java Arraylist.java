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
        List<List<Integer>> array = new ArrayList<>();
        int d, q, x, y;
        for (int i = 0; i < n; i++) {
            d = scanner.nextInt();
            List<Integer> a = new ArrayList<>();
            for (int j = 0; j < d; j++) {
                a.add(scanner.nextInt());
            }
            array.add(a);
        }
        q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            try {
                System.out.println(array.get(x-1).get(y-1));
            } catch (Exception ex) {
                System.out.println("ERROR!");
            }
        }
        System.out.println(array);
    }
}
