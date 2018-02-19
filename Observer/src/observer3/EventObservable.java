package observer3;

import java.util.ArrayList;
import java.util.List;

public abstract class EventObservable {

    ObserverEventHandler eventHandler = new ObserverEventHandler();

    public ObserverEventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(ObserverEventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public abstract void add(Object object, String methodName, Object... args);

    public abstract void notifyObject();

}
