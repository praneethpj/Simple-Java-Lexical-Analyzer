/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowcontrol;

/**
 *
 * @author Praneeth
 */
public class PrintCreate {
     String out = "";
    int a = 0;

    public PrintCreate(String value, int a) {
        String linea[] = value.split("\\b+");
        if (value.matches(".*\\bprint\\b.*") ) {
            this.a = 1;
            
        }
       
    }

    public PrintCreate(String value) {

        String linea[] = value.split("\\b+");
        if (value.matches(".*\\bprint\\b.*")) {
            out += "System.out.println(";
            out += " " + linea[2]  + ");";
        } 
        out+="\n";
    }
}
