package visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构，能枚举它的元素，可以提供一个高层的接口以允许访问者访问它的元素
 *
 * @author BaronZhao
 * 2018/2/19
 */
public class ObjectStructure {

    private List<Person> persons = new ArrayList<>();

    public void add(Person person){
        persons.add(person);
    }

    public void remove(Person person){
        persons.remove(person);
    }

    public void display(Action action){
        for (Person person : persons) {
            person.accept(action);
        }
    }
}
