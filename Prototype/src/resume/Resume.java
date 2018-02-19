package resume;

public class Resume implements Cloneable {

    private String name;

    private Integer age;

    private String context;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void show(){
        System.out.print("name:" + name + ", age:" + age.toString() + ", context:" + context +"\n");
    }

    @Override
    public Resume clone() throws CloneNotSupportedException {
        return (Resume)super.clone();
    }
}
