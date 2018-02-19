import interpreter.AbstractExpression;
import interpreter.Context;
import interpreter.NonterminalExpression;
import interpreter.TerminalExpression;

import java.util.ArrayList;
import java.util.List;

/**
 * 解释器模式（Interpreter）
 * 给定一个语言，定义它的文法的一种表示，并定义一个解释器，这个解释器使用该表示来解释语言中的句子。
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Interpreter pattern!");

        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());

        for (AbstractExpression exp : list) {
            exp.interpret(context);
        }
    }
}
