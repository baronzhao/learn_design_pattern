package observer1;

public class ConcreteObserver extends AbstractObserver {

    private String name;

    private ConcreteSubject subject;

    public ConcreteObserver(ConcreteSubject subject, String name) {
        this.subject = subject;
        this.name = name;
    }

    @Override
    public void update() {
        System.out.println("Observe " + name + " status is " + subject.getStatus());
    }
}
