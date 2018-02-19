package iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggrate extends Aggregate {

    private Object[] items;

    public ConcreteAggrate(int initialCapacity) {
        this.items = new Object[initialCapacity];
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public int size(){
        return items.length;
    }

    public Object get(int index){
        return items[index];
    }

    public Object set(int index, Object element){
        return items[index] = element;
    }
}
