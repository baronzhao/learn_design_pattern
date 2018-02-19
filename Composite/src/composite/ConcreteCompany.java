package composite;

import java.util.ArrayList;
import java.util.List;

public class ConcreteCompany extends Company{

    private List<Company> children = new ArrayList<Company>();

    public ConcreteCompany(String name) {
        super(name);
    }

    @Override
    public void add(Company c) {
        children.add(c);
    }

    @Override
    public void remove(Company c) {
        children.remove(c);
    }

    @Override
    public void display(Integer depth) {
        for(Integer i = 0; i < depth; i++){
            System.out.print("-");
        }
        System.out.println(name);

        for (Company company : children) {
            company.display(depth + 2);
        }
    }

    @Override
    public void showDuty() {
        for (Company company : children) {
            company.showDuty();
        }
    }
}
