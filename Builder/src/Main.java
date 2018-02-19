import builder.ProductABuilder;
import builder.ProductBBuilder;
import builder.ProductDirector;

/**
 * 建造者模式（Builder）
 * 将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示。
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Builder pattern!");

        ProductDirector director = new ProductDirector();
        ProductABuilder aBuilder = new ProductABuilder();
        ProductBBuilder bBuilder = new ProductBBuilder();
        director.build(aBuilder);
        director.build(bBuilder);
        aBuilder.getResult().show();
        System.out.println();
        bBuilder.getResult().show();

        return;
    }
}
