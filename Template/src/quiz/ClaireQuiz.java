package quiz;

public class ClaireQuiz extends Quiz {
    @Override
    public void showName() {
        System.out.println("Claire");
    }

    @Override
    protected String answerTest1() {
        return "2";
    }

    @Override
    protected String answerTest2() {
        return "9";
    }
}
