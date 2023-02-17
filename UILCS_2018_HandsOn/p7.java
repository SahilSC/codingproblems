import java.util.*;
import java.io.*;

class p7{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new FileReader("problem.in"));
        PrintWriter pw = new PrintWriter("problem.out");
        sc.next();
        while(sc.hasNext()){
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] mat = new int[r][c];
            for(int i = 0; i < r; i++){
                for(int j = 0; j < c; j++){
                    mat[i][j] = sc.nextInt();
                }
            }
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            newnum = sc.nextInt();
            boolean[][] vis = new boolean[r][c];
            originalnum = mat[r1][c1];
            dfs(mat, vis, r1,c1);
            for(int i = 0; i < mat.length; i++){
                for(int j = 0; j < mat[0].length; j++){
                    pw.print(mat[i][j] + " ");
                }
                pw.println();
            }
            pw.println("=====");
        }
        pw.close();

    }
    static int originalnum = -1;
    static int newnum = -1;
    static int ra[] = {-1, 1, 0, 0};
    static int ca[] = {0, 0, 1, -1};
    public static void dfs(int[][] mat, boolean vis[][], int r, int c){
        mat[r][c] = newnum;
        vis[r][c] = true;
        for(int i =0 ; i < 4; i++){
            int nr = r + ra[i];
            int nc = c + ca[i];
            if(nr >= 0 && nc >= 0 && nr < mat.length && nc < mat[0].length && !vis[nr][nc] && mat[nr][nc]==originalnum){
                dfs(mat, vis, nr, nc);
            }
        }
    }
}