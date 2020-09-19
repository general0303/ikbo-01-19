package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Main {
    public static void main(String[] args){
        String word;
        int f=0;
        File f1=new File("c://1212/A.txt");
        File f2=new File("c://1212/B.txt");
        try {
            Scanner scan = new Scanner(f1);
            PrintWriter pw=new PrintWriter(f2);
            while (scan.hasNext()) {
                word=scan.next();
                word=word.toUpperCase();
                pw.print('"'+word +'"'+ ", ");
                f++;
            }
            scan.close();
            pw.close();
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
