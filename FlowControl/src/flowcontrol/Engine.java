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
public class Engine {

    String print = "";
    String value;

    public Engine(String value) {

        this.value = value;
        String[] lines = value.split("\r\n|\r|\n");

        for (int i = 0; i < lines.length; i++) {
            if (lines[i].matches(".*\\bstart\\b.*")) {
                print += "public class Classname{\n";
                print += "public static void main(String [] args){\n";
                Nodes.brackets+="}";
                Nodes.brackets+="}";
            }
            VariableCreate v = new VariableCreate(lines[i], 0);
            IfCreator ifc = new IfCreator(lines[i], 0);
            PrintCreate printCreate = new PrintCreate(lines[i], 0);
            OperatorCreator operators=new OperatorCreator(lines[i], 0);
            
            if (v.a == 1) {

                v = new VariableCreate(lines[i]);
                print += v.out;

            }
            if (ifc.a == 1) {
                ifc = new IfCreator(lines[i]);
                print += ifc.print;

            }
            if(printCreate.a==1){
                printCreate = new PrintCreate(lines[i]); 
                print += printCreate.out;
            }
             if(operators.a==1){
                operators = new OperatorCreator(lines[i]); 
                print += operators.out;
            }


            
        }
        print+=Nodes.brackets;

    }

}
