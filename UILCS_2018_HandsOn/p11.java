package UILCS_2018_HandsOn;

import java.io.*;
import java.util.*;
class p11{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new FileReader("problem.in"));
        PrintWriter pw = new PrintWriter("problem.out");
        HashMap<String, String> hm = new HashMap<>();
        hm.put("JANUARY", "01");
        hm.put("FEBRUARY", "02");
        hm.put("MARCH", "03");
        hm.put("APRIL", "04");
        hm.put("MAY", "05");
        hm.put("JUNE", "06");
        hm.put("JULY", "07");
        hm.put("AUGUST", "08");
        hm.put("SEPTEMBER", "09");
        hm.put("OCTOBER", "10");
        hm.put("NOVEMBER", "11");
        hm.put("DECEMBER", "12");
        while(sc.hasNext()){
            String s = sc.nextLine();
            Scanner t = new Scanner(s).useDelimiter("[ ,]");
            String month = hm.get(t.next());
            String day = t.next();
            if(day.length() == 1)
                day="0"+day;
            t.next();
            String year = t.next();
            System.out.println(s);
            String me = month + "/" + day + "/" + year.substring(year.length()-2);
            String le = day + "." + month + "." + year;
            String be = year + "-" + month + "-" + day;
            pw.println(me);
            pw.println(le);
            pw.println(be);
            pw.println("=====");
        }
        pw.close();
    }
}