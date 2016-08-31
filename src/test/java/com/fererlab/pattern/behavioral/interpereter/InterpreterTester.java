package com.fererlab.pattern.behavioral.interpereter;

import com.fererlab.pattern.behavioral.interpreter.AndExpression;
import com.fererlab.pattern.behavioral.interpreter.Expression;
import com.fererlab.pattern.behavioral.interpreter.OrExpression;
import com.fererlab.pattern.behavioral.interpreter.TerminalExpression;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterTester {

    /**
     * UML: Client
     */
    @Test
    public void everydayExample() {
        /**
         * UML: Context
         */
        String input = "Lions, and tigers, and bears! Oh, my"; // Sentence

        Pattern pattern = Pattern.compile("(lion|cat|dog|wolf|bear|human|tiger|liger|Lion)"/*Grammar*/);

        Matcher matcher = pattern.matcher(input);

        // interpret the sentence and display what we parsed
        while (matcher.find()) {
            System.out.println("Found a " + matcher.group() + ".");
        }

    }

    /**
     * UML: Client
     */
    @Test
    public void testInterpreter() {
        /**
         * UML: Context
         */
        String context = "John";

        Expression isMale = getMaleExpression();
        System.out.println("John is male? " + isMale.interpret(context));

        /**
         * UML: Context
         */
        context = "Married Julie";
        Expression isMarriedWoman = getMarriedWomanExpression();
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret(context));
    }

    private Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }

    private Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

}
