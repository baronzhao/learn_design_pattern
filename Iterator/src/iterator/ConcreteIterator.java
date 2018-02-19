package iterator;

public class ConcreteIterator implements Iterator {

    private ConcreteAggrate aggrate;

    private int current = 0;

    public ConcreteIterator(ConcreteAggrate aggrate) {
        this.aggrate = aggrate;
    }

    @Override
    public Object first() {
        return aggrate.get(0);
    }

    @Override
    public Object next() {
        current++;
        if(current < aggrate.size()){
            return aggrate.get(current);
        }
        return null;
    }

    @Override
    public boolean isDone() {
        return current >= aggrate.size() - 1 ? true : false;
    }

    @Override
    public Object currentItem() {
        return aggrate.get(current);
    }
}
