package builder;

public class ProductBBuilder implements ProductBuilder {

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.addPart("X");
    }

    @Override
    public void buildPartB() {
        product.addPart("Y");
    }

    @Override
    public void buildPartC() {
        product.addPart("Z");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
