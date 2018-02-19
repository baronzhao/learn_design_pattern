package proxy;

public class SubjectProxy implements Subject {

    RealSubject realSubject;

    @Override
    public void request() {
        if(realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
