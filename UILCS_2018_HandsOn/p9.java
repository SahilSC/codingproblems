package UILCS_2018_HandsOn;

import java.io.*;
import java.util.*;

class p9{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new FileReader("problem.in"));
        PrintWriter pw = new PrintWriter("problem.out");
        while(sc.hasNext()){
            double a, b, c = -1;
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            double val = sc.nextDouble();
            String ch = sc.next();
            if(ch.equals("A")) {
                a = val;
                b = 1/x * a;
                c = 1/y * b;
            }
            else if (ch.equals("B")) {
                b = val;
                a = b*x;
                c = a/x/y;
            }
            else {
                c = val;
                a = x*y*c;
                b = a/x;
            }
            pw.printf("A = %3.3f%n", a);
            pw.printf("B = %3.3f%n", b);
            pw.printf("C = %3.3f%n", c);
            pw.println("=====");
        }
        pw.close();
    }
}