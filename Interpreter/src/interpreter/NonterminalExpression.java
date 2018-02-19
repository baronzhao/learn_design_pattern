package interpreter;

/**
 * 非终结符表达式，为文法中的非终结符实现解释操作。
 * 对文法中的每一条规则R1、R2……Rn都需要一个具体的非终结符表达式
 *
 * @author BaronZhao
 * 2018/2/19
 */
public class NonterminalExpression implements AbstractExpression{

    @Override
    public void interpret(Context context) {
        System.out.println("非终端解释器");
    }
}
