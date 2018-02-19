package visitor;

/**
 * 状态接口
 *
 * @author BaronZhao
 * 2018/2/19
 */
public interface Action {

    void manAction(Man man);

    void womanAction(Woman woman);
}
