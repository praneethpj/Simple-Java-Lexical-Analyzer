/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowcontrol;

import java.util.Arrays;

/**
 *
 * @author Praneeth
 */
public class IfCreator {

    String print = "";
   int a=0;
  public IfCreator(String value,int a) {
            String[] splited = value.split("\\b+"); //split on space

        if (Arrays.asList(splited).contains("if")) {
            this.a=1;
            
        }
  }
    public IfCreator(String value) {

        String[] splited = value.split("\\b+"); //split on space

        if (Arrays.asList(splited).contains("if")) {

            print += "if(" + splited[2];
            if (splited[3].equals("=")) {
                print += "==";
            } else {
                print += splited[3];
            }
            print += splited[4] + "){"+"\n";
            Nodes.brackets+="}";
        }

    }

}
