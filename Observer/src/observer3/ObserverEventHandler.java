package observer3;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class ObserverEventHandler {

    List<ObserverEvent> events;

    public ObserverEventHandler() {
        this.events = new ArrayList<ObserverEvent>();
    }

    public void addEvent(Object object, String methodName, Object... args){
        events.add(new ObserverEvent(object, methodName, args));
    }

    public void notifyObjects() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        for (ObserverEvent event : events) {
            event.invoke();
        }
    }


}
