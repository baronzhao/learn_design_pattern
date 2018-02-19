package observer2;

import java.util.Observable;
import java.util.Observer;

public class JdkConcreteObserver implements Observer {

    private String name;

    public JdkConcreteObserver(Observable o, String name) {
        this.name = name;
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Observe " + name + " status is " + ((JdkConcreteSubject)o).getStatus());
    }
}
