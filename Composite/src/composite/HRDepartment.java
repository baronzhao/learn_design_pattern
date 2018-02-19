package composite;

public class HRDepartment extends Company {

    public HRDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
    }

    @Override
    public void remove(Company c) {
    }

    @Override
    public void display(Integer depth) {
        for(Integer i = 0; i < depth; i++){
            System.out.print("-");
        }
        System.out.println(name);
    }

    @Override
    public void showDuty() {
        System.out.println(name + "--人力资源管理");
    }
}
