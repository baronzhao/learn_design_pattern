package operate;

/**
 * 运算工厂
 */
public class OperateFactory {
    public static AbstractOperate createOperate(String operateSymbol){
        AbstractOperate operate = null;
        switch (operateSymbol){
            case "+":
                operate = new AddOpreate();
                break;
            case "-":
                operate = new SubOperate();
                break;
            case "*":
                operate = new MulOperate();
                break;
            case "/":
                operate = new DivOperate();
                break;
        }
        return operate;
    }
}
