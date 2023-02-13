import java.io.*;
import java.util.*;

public class p4{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("problem.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("problem.out")));
        String[] key = {"---", "--x", "-w-", "-wx", "r--", "r-x", "rw-", "rwx"};
        while(sc.hasNext()){
            String s = sc.next();
            int ch = s.charAt(0);
            String output = "";
            if(ch == 'F')
                output = "-";
            else if (ch == 'D')
                output = "d";
            else
                output = "l";
            for(int i = 1; i <=3; i++){
                int num = Integer.parseInt(s.substring(i, i + 1));
                output += key[num];
            }
            pw.println(output);
        }

        pw.close();
    }
}
