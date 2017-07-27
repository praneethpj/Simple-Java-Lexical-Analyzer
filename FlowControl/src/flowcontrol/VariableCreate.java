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
public class VariableCreate {

    String out = "";
    int a = 0;

    public VariableCreate(String value, int a) {
        String linea[] = value.split("\\b+");
        if (value.matches(".*\\binteger\\b.*") | value.matches(".*\\bchar\\b.*") | value.matches(".*\\bstr\\b.*")) {
            this.a = 1;
            
        }
       
    }

    public VariableCreate(String value) {

        String linea[] = value.split("\\b+");
        if (value.matches(".*\\binteger\\b.*")) {
            out += "int";
            out += " " + linea[2] + linea[3] + linea[4] + ";";
        } else if (value.matches(".*\\bchar\\b.*")) {
            out += "char";
            out += " " + linea[2] + linea[3] + linea[4] + ";";
        }

        out+="\n";
    }

}
