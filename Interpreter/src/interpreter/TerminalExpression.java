package interpreter;

/**
 * 终结符表达式，实现与文法中的终结符相关的解释操作
 *
 * @author BaronZhao
 * 2018/2/19
 */
public class TerminalExpression implements AbstractExpression {

    @Override
    public void interpret(Context context) {
        System.out.println("终端解释器");
    }
}
