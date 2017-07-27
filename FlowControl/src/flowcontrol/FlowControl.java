/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowcontrol;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Praneeth
 */
public class FlowControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {

        String str = "";

        BufferedReader read = new BufferedReader(new FileReader(new File("psudeo.txt")));

        String sourceLine = null;

        while ((sourceLine = read.readLine()) != null) {
            str += sourceLine+"\n";
        }

        FileWriter fw = new FileWriter("Classname.java");
        BufferedWriter bw = new BufferedWriter(fw);

        Engine i = new Engine(str);
        System.out.println(i.print);
        bw.write(i.print);
        
        read.close();
        bw.close();
    }

}
