package abstractfactory;

public class MysqlDepartment implements DepartmentInterface {
    @Override
    public void insert() {
        System.out.println("insert into mysql department table");
    }

    @Override
    public void delete() {
        System.out.println("delete from mysql department table");
    }
}
