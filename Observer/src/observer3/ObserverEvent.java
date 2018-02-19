package observer3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ObserverEvent {

    private Object object;

    private String methodName;

    private Object[] params;

    private Class[] paramTypes;

    public ObserverEvent(Object object, String methodName, Object... args) {
        this.object = object;
        this.methodName = methodName;
        this.params = args;
        contractParamTypes(this.params);
    }

    private void contractParamTypes(Object[] params) {
        paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            paramTypes[i] = params[i].getClass();
        }
    }

    public void invoke() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method method = object.getClass().getMethod(this.methodName, this.paramTypes);
        if(null == method){
            return;
        }
        method.invoke(this.object, this.params);
    }

}
