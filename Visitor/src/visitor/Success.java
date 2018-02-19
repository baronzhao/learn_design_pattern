package visitor;

/**
 * 成功时的不同状态
 *
 * @author BaronZhao
 * 2018/2/19
 */
public class Success implements Action {
    @Override
    public void manAction(Man man) {
        System.out.println(man.getClass().getSimpleName() + this.getClass().getSimpleName() + "时，背后多半有一个伟大的女人。");
    }

    @Override
    public void womanAction(Woman woman) {
        System.out.println(woman.getClass().getSimpleName() +  this.getClass().getSimpleName() + "时，背后大多有一个不成功的男人。");
    }
}
