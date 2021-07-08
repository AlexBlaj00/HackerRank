import java.io.*;
import java.util.*;

abstract class Book{
    String title;

    abstract void setTitle(String s);

    String getTitle(){
        return title;
    }
}

class MyBook extends Book {

    String title;

    void setTitle(String titlu){
        this.title = titlu;
    }

    String getTitle(){
        return title;
    }
}



public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        MyBook new_title = new MyBook();
        new_title.setTitle(title);
        System.out.println( "The title is: " + new_title.getTitle());
        scanner.close();
    }
}