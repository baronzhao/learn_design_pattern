package observer1;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractSubject {

    private List<AbstractObserver> observers = new ArrayList<AbstractObserver>();

    public void add(AbstractObserver observer){
        observers.add(observer);
    }

    public void remove(AbstractObserver observer){
        observers.remove(observer);
    }

    public void notifyObservers(){
        for (AbstractObserver observer : observers) {
            observer.update();
        }
    }
}
