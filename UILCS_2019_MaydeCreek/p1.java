import java.util.*;
import java.io.*;

class p1{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new FileReader("problem.in"));
        PrintWriter pw = new PrintWriter("problem.out");
        while (sc.hasNext()) {
            String s = sc.nextLine();
            Scanner t = new Scanner(s);
            ArrayList<Integer> arr = new ArrayList<>();
            arr.add(1);
            while(t.hasNext()){
                arr.add(t.nextInt());
            }
            arr.add(1);
            for(int i = 1; i < arr.size()-1; i++){
                int num = arr.get(i);
                int num1 = arr.get(i-1);
                int num2 = arr.get(i+1);
                pw.print(num*num1*num2 + " ");
            }
            pw.println();

        }
        pw.close();

    }
}