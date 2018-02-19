package visitor;

/**
 * 女人
 *
 * @author BaronZhao
 * 2018/2/19
 */
public class Woman implements Person {
    @Override
    public void accept(Action action) {
        action.womanAction(this);
    }
}
