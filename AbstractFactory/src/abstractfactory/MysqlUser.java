package abstractfactory;

public class MysqlUser implements UserInterface {
    @Override
    public void insert() {
        System.out.println("insert into mysql user table");
    }

    @Override
    public void delete() {
        System.out.println("delete from mysql user table");
    }
}
