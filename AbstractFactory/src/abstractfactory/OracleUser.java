package abstractfactory;

public class OracleUser implements UserInterface {
    @Override
    public void insert() {
        System.out.println("insert into oracle user table");
    }

    @Override
    public void delete() {
        System.out.println("delete from oracle user table");
    }
}
