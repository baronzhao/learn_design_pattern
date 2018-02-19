import quiz.BaronQuiz;
import quiz.ClaireQuiz;

/**
 * 模板模式（Template）
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("welcome to the Template pattern!");

        BaronQuiz baron = new BaronQuiz();
        ClaireQuiz claire = new ClaireQuiz();

        System.out.println("show your answers:");
        baron.showName();
        baron.test1();
        baron.test2();

        System.out.println();
        claire.showName();
        claire.test1();
        claire.test2();

        return;
    }
}
