/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowcontrol;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 * @author Praneeth
 */
public class OperatorCreator {

    String out = "";
    int a = 0;

    public OperatorCreator(String value, int a) {
        HashSet<Character> match = new HashSet<Character>(Arrays.asList('+', '-', '*', '/', '&', '!', '%', '^', '|', '<', '>'));

        for (int i = 0; i < value.length(); i++) {

            if (match.contains(value.charAt(i))) {
                this.a = 1;

            }
        }

    }

    public OperatorCreator(String value) {

        String linea[] = value.split("\\b+");

        for (int j = 0; j < linea.length; j++) {

            out += linea[j] + "";

        }
        out += ";\n";
    }
}
