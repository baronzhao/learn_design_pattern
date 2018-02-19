import flyweight.User;
import flyweight.Website;
import flyweight.WebsiteFactory;

/**
 * 享元模式（Flyweight）
 * 运用共享技术有效地支持大量细粒度的对象。
 *
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Flyweight pattern!");

        WebsiteFactory factory = new WebsiteFactory();

        Website website1 = factory.websiteFromType("Show");
        website1.use(new User("Baron"));

        Website website2 = factory.websiteFromType("Show");
        website2.use(new User("Claire"));

        Website website3 = factory.websiteFromType("Show");
        website3.use(new User("Max"));


        Website website4 = factory.websiteFromType("Blog");
        website4.use(new User("Chris"));

        Website website5 = factory.websiteFromType("Blog");
        website5.use(new User("Dan"));

        Website website6 = factory.websiteFromType("Blog");
        website6.use(new User("Kate"));

        System.out.println("Factory size:" + factory.size());
    }
}
