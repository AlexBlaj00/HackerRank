import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s, counter = 0;
        int [] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        scanner.close();
        for (int i = 0; i < a.length; i++) {
            s = 0;
            for (int j = i; j < a.length; j++) {
                s += a[j];
                if (s < 0 )
                    counter++;
            }
        }
        System.out.println(counter);
    }
}