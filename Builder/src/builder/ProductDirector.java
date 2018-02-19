package builder;

public class ProductDirector {

    public void build(ProductBuilder builder) {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
