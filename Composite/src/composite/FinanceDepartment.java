package composite;

public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
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
        System.out.println(name + "--财务管理");
    }
}
