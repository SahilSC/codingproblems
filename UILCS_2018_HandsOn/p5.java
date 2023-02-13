package UILCS_2018_HandsOn;

import java.io.*;
import java.util.*;

public class p5 {
    static int[] rdir = {0, 1, 0, -1}; //right, down, left, up
    static int[] cdir = {1, 0, -1, 0};
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("problem.in"));
        PrintWriter pw = new PrintWriter(new FileWriter("problem.out"));
        while(sc.hasNext()){
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            int dir = 0;
            int cnt = 1;
            int r = 0;
            int c = 0;
            while(cnt != n*n + 1){
                arr[r][c] = cnt;
                int nr = r + rdir[dir];
                int nc = c + cdir[dir];
                if(nr >= n || nc >= n || nc < 0 || nr < 0 || arr[nr][nc] != 0){
                    if(dir == 0){
                        r+=1;
                    }
                    else if(dir == 1){
                        c-=1;
                    } else if (dir == 2){
                        r-=1;
                    }
                    else{
                        c+=1;
                    }
                    dir+=1;
                    dir %= 4;
                }
                else{
                    c = nc;
                    r = nr;
                }
                cnt++;
            }
            for(int i = 0; i < n; i++){
                for (int j = 0; j < n; j++) {
                    if(n <= 3){
                        pw.printf("%1d ", arr[i][j]);
                    }
                    else if(n<=9){
                        pw.printf("%2d ", arr[i][j]);
                    }
                    else
                        pw.printf("%3d ", arr[i][j]);
                }
                pw.println();
            }
            pw.println("=====");

        }
        pw.close();
    }
}
