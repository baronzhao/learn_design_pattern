import mediator.America;
import mediator.Iraq;
import mediator.UnitedNationsSecurityCouncil;

/**
 * 中介者模式（Mediator）
 * 用一个中介对象来封装一系列的对象交互，中介者使各对象不需要显式地相互引用，
 * 从而使其耦合松散，而且可以独立地改变他们之间的交互。
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Mediator pattern!");

        UnitedNationsSecurityCouncil mediator = new UnitedNationsSecurityCouncil();
        America america = new America(mediator);
        Iraq iraq = new Iraq(mediator);

        mediator.setAmerica(america);
        mediator.setIraq(iraq);

        america.declare("Give up nuclear weapon, or I will hit you! -From America");
        iraq.declare("I don't have nuclear weapon, I'm not afraid of you! -From Iraq");
    }
}
