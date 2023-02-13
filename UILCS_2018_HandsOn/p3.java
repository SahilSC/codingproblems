package UILCS_2018_HandsOn;

import java.io.*;
import java.util.*;

public class p3 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new FileReader("problem.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("problem.out")));
        int q = sc.nextInt();
        int[] v = new int[q];
        int[] w = new int[q];
        int sumw = 0;
        for(int i = 0; i < q; i++){
            v[i] = sc.nextInt();
            w[i] = sc.nextInt();
            sumw+= w[i];
        }
        long[] ans = new long[sumw+1];
        ArrayList<Integer>[] arr = new ArrayList[sumw+1];
        for(int i = 0; i < sumw+1; i++){
            arr[i] = new ArrayList<>();
        }
        for(int j = 0; j < q; j++) {
            for (int i = ans.length - 1; i >= 0; i--) {
                if (i - w[j] < 0)
                    break;
                else if(i-w[j] == 0){
                    if(v[j] > ans[i]){
                        ArrayList<Integer> t = new ArrayList<>();
                        t.add(j);
                        arr[i] = t;
                    }
                    ans[i] = Math.max(ans[i], v[j]);
                }
                else if(ans[i-w[j]] != 0){
                    if(ans[i-w[j]] + v[j] > ans[i]) {
                        ArrayList<Integer> t = arr[i-w[j]];
                        ArrayList<Integer> update = new ArrayList<>();
                        for(int k = 0; k< t.size(); k++){
                            update.add(t.get(k));
                        }
                        update.add(j);
                        arr[i] = update;
                    }
                    ans[i] = Math.max(ans[i], ans[i-w[j]] + v[j]);

                }
            }
        }
        int[] index = new int[sumw+1];
        index[0] = 0;
        long maxval = 0;
        int ind = 0;
        for(int i = 1; i < index.length; i++){
            if(ans[i] > maxval){
                maxval = ans[i];
                ind = i;
            }
            index[i] = ind;
        }
       /* for(int i =0 ; i < ans.length; i++){
            System.out.println(ans[i]);
        }*/
        while(sc.hasNext()){
            int a = sc.nextInt();
            int givenind = index[a];
            long expectedpoints = ans[givenind];
            ArrayList<Integer> list = arr[givenind];
            System.out.printf("Target diff     = %d%n", a);
            System.out.printf("Calculated diff = %d%n", givenind);
            System.out.printf("Expected points = %d%n", expectedpoints);
            for(int i = 1; i <= list.size(); i++){
                int coinind = list.get(i-1);
                int coinval = v[coinind];
                int coinweight = w[coinind];
                System.out.printf("Q#%2d,%3d pts, diff %d%n", coinind+1, coinval, coinweight);
            }
            System.out.printf("=====%n");
        }
        pw.close();
    }
}
