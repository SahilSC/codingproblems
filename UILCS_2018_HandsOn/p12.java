package UILCS_2018_HandsOn;

import java.util.*;
import java.io.*;
class p12{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new FileReader("problem.in"));
        PrintWriter pw = new PrintWriter("problem.out");
        while (sc.hasNext()) {
            int s = sc.nextInt();
            pw.println(s + " " + (-(s+1)));
        }
        pw.close();
    }
}