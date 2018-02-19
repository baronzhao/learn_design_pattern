package quiz;

public class BaronQuiz extends Quiz {

    @Override
    public void showName() {
        System.out.println("Baron");
    }

    @Override
    protected String answerTest1() {
        return "2";
    }

    @Override
    protected String answerTest2() {
        return "6";
    }
}
