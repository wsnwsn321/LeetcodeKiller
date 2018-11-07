package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class TwilowOA1 {
    public static void main(String[] args) throws Exception  {
        String filename = "/Users/wsnwsn321/IdeaProjects/LeetcodeKiller/src/com/company/sampleInput.txt";
        String outfilename = "/Users/wsnwsn321/IdeaProjects/LeetcodeKiller/src/com/company/sampleOut.txt";
        BufferedReader br = new BufferedReader(new FileReader(filename));
        BufferedWriter bw = new BufferedWriter(new FileWriter(outfilename));
        String st = br.readLine();
        while (st != null){
            bw.write(st);
            bw.write("\n");
            st = br.readLine();
        }
        bw.close();
    }
}
