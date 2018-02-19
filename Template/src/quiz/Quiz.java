package quiz;

public abstract class Quiz {

    public abstract void showName();

    public void test1(){
        System.out.println("1+1=？");
        System.out.println("Answer:" + answerTest1());
    }

    protected abstract String answerTest1();

    public void test2(){
        System.out.println("3+3=?");
        System.out.println("Answer:" + answerTest2());
    }

    protected abstract String answerTest2();
}
