import iterator.ConcreteAggrate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 迭代器模式（Iterator）
 * 提供一种方法顺序访问一个聚合对象中各个元素，而又不暴露该对象的内部表示。
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Iterator pattern!");

        List<String> strings = new ArrayList<String>();
        strings.add("Baron");
        strings.add("Claire");
        strings.add("home");

        System.out.println("====Iterator=====");
        Iterator itr = strings.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("====foreach=====");
        for (String str: strings) {
            System.out.println(str);
        }

        System.out.println("====my=====");
        ConcreteAggrate aggrate = new ConcreteAggrate(3);
        aggrate.set(0,"Baron");
        aggrate.set(1,"Claire");
        aggrate.set(2,"XT");

        iterator.Iterator iterator = aggrate.createIterator();
        System.out.println(iterator.first());
        while (!iterator.isDone()){
            System.out.println(iterator.next());
        }



    }
}
