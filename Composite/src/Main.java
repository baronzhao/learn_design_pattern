import composite.ConcreteCompany;
import composite.FinanceDepartment;
import composite.HRDepartment;

/**
 * 组合模式（Composite）
 * 将对象组合成树形结构以表示"部分-整体"的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to the Composite pattern!");

        ConcreteCompany root = new ConcreteCompany("北京总公司");
        root.add(new HRDepartment("总公司人力资源部门"));
        root.add(new FinanceDepartment("总公司财务部门"));

        ConcreteCompany comp = new ConcreteCompany("上海华东分公司");
        comp.add(new HRDepartment("华东分公司人力资源部门"));
        comp.add(new FinanceDepartment("华东分公司财务部门"));
        root.add(comp);

        ConcreteCompany comp1 = new ConcreteCompany("南京办事处");
        comp1.add(new HRDepartment("南京办事处人力资源部门"));
        comp1.add(new FinanceDepartment("南京办事处财务部门"));
        comp.add(comp1);

        ConcreteCompany comp2 = new ConcreteCompany("杭州办事处");
        comp2.add(new HRDepartment("杭州办事处人力资源部门"));
        comp2.add(new FinanceDepartment("杭州办事处财务部门"));
        comp.add(comp2);

        System.out.println("结构图：");
        root.display(1);

        System.out.println("\n职责：");
        root.showDuty();

        return;
    }
}
