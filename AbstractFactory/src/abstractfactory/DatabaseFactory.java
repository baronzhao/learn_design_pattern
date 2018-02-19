package abstractfactory;

public class DatabaseFactory {

    private String database;

    public DatabaseFactory(String database) {
        this.database = database;
    }

    public UserInterface createUser() throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class<?> userClass = Class.forName("abstractfactory." + database + "User");
        return (UserInterface) userClass.newInstance();
    }

    public DepartmentInterface createDepartment() throws ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class<?> userClass = Class.forName("abstractfactory." + database + "Department");
        return (DepartmentInterface) userClass.newInstance();
    }

}
