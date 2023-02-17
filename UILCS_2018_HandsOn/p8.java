package UILCS_2018_HandsOn;

import java.io.*;
import java.util.*;

class p8{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new FileReader("problem.in"));
        PrintWriter pw = new PrintWriter("problem.out");

        while(sc.hasNext()){
            int s = sc.nextInt();
            int[][] arr = new int[(int) Math.pow(2, s)][s];
            num = 0;
            recurse(arr, 0, 0, arr.length-1);
            pw.print("  ");
            for(int i = 0; i < s; i++){
                if(i!= 0)
                    pw.print("|" + (char)('A' + i));
                else
                    pw.print('A');
            }
            pw.println();
            for(int i = 0; i < arr.length; i++){
                pw.print((i + 1) + " ");
                for(int j = 0; j < arr[0].length;j++) {
                    if (j == 0)
                        pw.print(arr[i][j]);
                    else
                        pw.print("|"+ arr[i][j]);
                }
                pw.println();
            }
            pw.println("=====");
        }
        pw.close();
    }
    public static int num = -1;
    public static void recurse(int[][] arr, int c, int st, int end){
        if(c >= arr[0].length){
            return;
        }
        int mid = (st + end)/2;
        for(int i = mid+1; i <= end; i++){
            arr[i][c] = 1;
        }
        recurse(arr, c+1, st, mid);
        recurse(arr, c+1, mid+1, end);
    }
}