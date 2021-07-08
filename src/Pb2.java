import java.io.*;
import java.util.*;

class Arithmetic {
    public int add (int a, int b) {
        return a+b;
    }
}

class Adder extends Arithmetic {

}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Adder add = new Adder();
        System.out.println("My superclass is: " + add.getClass().getSuperclass().getName());
        System.out.print(add.add(21,21) + " " + add.add(5,8) + " " + add.add(10,10));
    }
}
