package com.fererlab.pattern.behavioral.interpreter;

import java.util.StringTokenizer;

/**
 * UML: TerminalExpression
 */
public class TerminalExpression implements Expression{

    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean interpret(String context) {
        StringTokenizer stringTokenizer = new StringTokenizer(context);
        while (stringTokenizer.hasMoreTokens()){
            String test = stringTokenizer.nextToken();
            if(test.equals(data)){
                return true;
            }
        }
        return false;
    }
}
