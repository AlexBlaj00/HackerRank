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
        scanner.nextLine();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String name = scanner.nextLine();
            int number = scanner.nextInt();
            //System.out.println(name + " " + number);
            scanner.nextLine();
            map.put(name, number);
        }

        while (scanner.hasNext()) {
            String arg = scanner.nextLine();
            if (map.containsKey(arg)) {
                System.out.println(arg + "=" + map.get(arg));
            }
            else
                System.out.println("Not found");
        }
        scanner.close();
    }
}
