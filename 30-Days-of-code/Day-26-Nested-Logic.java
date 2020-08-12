import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int dA , mA , yA , dE , mE , yE , fine=1000;
        Scanner in  = new Scanner(System.in);
        dA = in.nextInt();
        mA = in.nextInt();
        yA = in.nextInt();
        dE = in.nextInt();
        mE = in.nextInt();
        yE = in.nextInt();
        
            if(yA>yE){
                fine  = 10000;
            }
            else if(dA>dE&&mA==mE&&yA==yE){
                fine = 15*(dA-dE);
            }
            else if(mA>mE&&yA==yE){
                fine = 500*(mA-mE);
            }
            else if(yA<=yE||(mA<=mE&&yA<=yE)||(dA<=dE&&yA<=yE)){
                fine = 0;
            }
            

        
            System.out.println(fine);

        
    }

}
