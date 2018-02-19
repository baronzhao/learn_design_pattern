package observer3;

public class ConcreteEventObservable extends EventObservable {

    @Override
    public void add(Object object, String methodName, Object... args) {
        getEventHandler().addEvent(object, methodName, args);
    }

    @Override
    public void notifyObject() {
        try {
            getEventHandler().notifyObjects();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
