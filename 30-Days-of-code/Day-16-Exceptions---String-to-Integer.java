import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            String S = in.next();
            Integer result = Integer.valueOf(S);        
            System.out.println(result);
        }catch(Exception e)
                {
                System.out.println("Bad String");
        }
    }
}
