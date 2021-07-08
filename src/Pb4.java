import java.io.*;
import java.util.*;

interface AdvancedArithmetic {
    int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    public int divisor_sum(int n)
    {
        int sum = 0;
        for( int i = 1; i <= n; i ++) {
            if(n%i == 0){
                sum += i;
            }
        }
        return sum;
    }
}


public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        MyCalculator calc = new MyCalculator();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.print("I implemented: ");
        InterfaceName(calc);
        System.out.println(calc.divisor_sum(n));
    }

    static void InterfaceName(Object o) {
        Class c = o.getClass();
        Class[] theInterfaces = c.getInterfaces();
        for (int i = 0; i < theInterfaces.length; i++) {
            String interfaceName = theInterfaces[i].getName();
            System.out.println(interfaceName);
        }
    }
}
