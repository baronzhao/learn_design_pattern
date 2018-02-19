package abstractfactory;

public class OracleDepartment implements DepartmentInterface {
    @Override
    public void insert() {
        System.out.println("insert into oracle department table");
    }

    @Override
    public void delete() {
        System.out.println("delete from oracle department table");
    }
}
