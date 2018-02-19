import observer1.ConcreteObserver;
import observer1.ConcreteSubject;
import observer2.JdkConcreteObserver;
import observer2.JdkConcreteSubject;
import observer3.ConcreteEventObservable;
import observer3.ReadableObserverTwo;
import observer3.ReadableObserverOne;

import java.util.Date;

/**
 * 观察者模式（Observer）
 * 定义了一种一对多的依赖关系，让多个观察者对象同时监听某一个主题对象，
 * 这个主题对象在状态发生变化时，会通知所有观察者对象，使它们能够自动更新自己。
 *
 * 1-原生实现
 * 2-jdk实现
 * 3-反射实现
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Observer pattern!");

        System.out.println("Round one:");

        ConcreteSubject subject = new ConcreteSubject();
        subject.add(new ConcreteObserver(subject, "Baron"));
        subject.add(new ConcreteObserver(subject, "Claire"));

        subject.setStatus("go to work");
        subject.notifyObservers();

        System.out.println("Round two:");
        JdkConcreteSubject jdkSubject = new JdkConcreteSubject();
        new JdkConcreteObserver(jdkSubject, "Baron");
        new JdkConcreteObserver(jdkSubject, "Claire");

        jdkSubject.setStatus("stop working");
        jdkSubject.notifyObservers();

        System.out.println("Round three:");
        ConcreteEventObservable eventObservable = new ConcreteEventObservable();
        ReadableObserverOne observerOne = new ReadableObserverOne();
        ReadableObserverTwo observerTwo = new ReadableObserverTwo();
        eventObservable.add(observerOne, "showDate", new Date());
        eventObservable.add(observerTwo, "showMessage", "Hello World!");

        eventObservable.notifyObject();

        return;
    }
}
