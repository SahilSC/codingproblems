package UILCS_2018_HandsOn;

import java.io.*;
import java.util.*;

class p6{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new FileReader("problem.in"));
        PrintWriter pw = new PrintWriter("problem.out");
        String[] arr = new String[52];
        arr[0] = "A0";
        arr[1] = "B0";
        String[] chars = {"C", "D", "E", "F", "G", "A", "B"};
        int cnt = 3;
        for(int i = 1; i <= 7; i++){
            for(int j = 0; j < 7; j++){
                arr[cnt] = chars[j] + i;
                cnt++;
            }
        }
        while(sc.hasNext()){
            String s = sc.nextLine();
            Scanner t = new Scanner(s);
            String initial = t.next();
            int findind = 0;
            for(int i = 0; i < 52; i++){
                if (initial.equals(arr[i])){
                    findind = i;
                    break;
                }
            }
            String output = initial;
            while(t.hasNext()){
                String str = t.next();
                int num = Integer.parseInt(str);
                if(num > 0)
                    num-=1;
                else
                    num+=1;
                findind += num;
                output += " " + arr[findind];
            }
            pw.println(output);
        }
        pw.close();

    }
}