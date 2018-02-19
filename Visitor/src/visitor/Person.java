package visitor;

/**
 * 人，用于实现稳定的数据结构"男人"和"女人"
 *
 * @author BaronZhao
 * 2018/2/19
 */
public interface Person {

    void accept(Action action);
}
