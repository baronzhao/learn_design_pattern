package visitor;

/**
 * 男人
 *
 * @author BaronZhao
 * 2018/2/19
 */
public class Man implements Person{
    @Override
    public void accept(Action action) {
        action.manAction(this);
    }
}
