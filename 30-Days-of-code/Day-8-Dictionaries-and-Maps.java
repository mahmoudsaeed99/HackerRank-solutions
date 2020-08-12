import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> x = new HashMap<String,Integer>();
        int n = in.nextInt();
        String[] s = new String[n];
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            x.put(name,phone);
        }
        int k=0;
        while(in.hasNext()){
             String name = in.next();
            if (x.containsKey(name)) {
                int phone = x.get(name);
                System.out.println(name + "=" + phone);
            } else System.out.println("Not found");
        
        }

        in.close();
    }
}
