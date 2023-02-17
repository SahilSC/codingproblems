package UILCS_2018_HandsOn;

import java.io.*;
import java.util.*;
class p10{
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(new FileReader("problem.in"));
        PrintWriter pw = new PrintWriter("problem.out");
        HashMap<Character, String> hm = new HashMap<>();
        hm.put('A',"Alpha");
        hm.put('B',"Bravo");
        hm.put('C',"Charlie");
        hm.put('D',"Delta");
        hm.put('E',"Echo");
        hm.put('F',"Foxtrot");
        hm.put('G',"Golf");
        hm.put('H',"Hotel");
        hm.put('I',"India");
        hm.put('J',"Juliet");
        hm.put('K',"Kilo");
        hm.put('L',"Lima");
        hm.put('M',"Mike");
        hm.put('N',"November");
        hm.put('O',"Oscar");
        hm.put('P',"Papa");
        hm.put('Q',"Quebec");
        hm.put('R',"Romeo");
        hm.put('S',"Sierra");
        hm.put('T',"Tango");
        hm.put('U',"Uniform");
        hm.put('V',"Victor");
        hm.put('W',"Whiskey");
        hm.put('X',"Xray");
        hm.put('Y',"Yankee");
        hm.put('Z',"Zulu");
        hm.put('0',"Zero");
        hm.put('1',"Wun");
        hm.put('2',"Too");
        hm.put('3',"Tree");
        hm.put('4',"Fower");
        hm.put('5',"Fife");
        hm.put('6',"Six");
        hm.put('7',"Seven");
        hm.put('8',"Ait");
        hm.put('9',"Niner");
        while(sc.hasNext()){
            String s = sc.next();
            String str = "";
            for(int i = 0; i < s.length(); i++){
                char c = s.charAt(i);
                if(i!= s.length()-1)
                    str += hm.get(c) + " ";
                else
                    str += hm.get(c);
            }
            pw.println(str);
        }
        pw.close();

    }
}