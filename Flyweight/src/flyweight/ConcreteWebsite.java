package flyweight;

public class ConcreteWebsite implements Website {

    private String type;

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("Website type [" + type + "] for user [" + user.getName() + "]");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
