import java.io.*;
import java.util.*;

class a {
    String define_me() {
        return "a cycle with an engine.";
    }
}

class b extends a {
    String define_me() {
        return "a vehicle with pedals.";
    }

    b() {
        String engine = super.define_me();
        String pedals = define_me();
        System.out.println("Hello I am a motorcycle, I am "+ engine);
        System.out.println("My ancestor is a cycle who is "+ pedals );
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        b test = new b();
    }
}
