package visitor;

/**
 * 失败时的不同状态
 *
 * @author BaronZhao
 * 2018/2/19
 */
public class Failing implements Action {
    @Override
    public void manAction(Man man) {
        System.out.println(man.getClass().getSimpleName() + this.getClass().getSimpleName() + "时，闷头喝酒，谁都不用劝。");
    }

    @Override
    public void womanAction(Woman woman) {
        System.out.println(woman.getClass().getSimpleName() + this.getClass().getSimpleName() + "时，眼泪汪汪，谁都劝不住。");
    }
}
