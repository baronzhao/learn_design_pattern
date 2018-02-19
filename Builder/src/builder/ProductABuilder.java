package builder;

public class ProductABuilder implements ProductBuilder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("A");
    }

    @Override
    public void buildPartB() {
        product.addPart("B");
    }

    @Override
    public void buildPartC() {
        product.addPart("C");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
