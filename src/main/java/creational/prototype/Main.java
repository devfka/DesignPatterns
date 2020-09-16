package creational.prototype;

import java.util.List;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emps = new Employee();
        emps.loadData();

        Employee empsNew = (Employee) emps.clone();
        Employee empsNew1 = (Employee) emps.clone();

        List<String> list = empsNew.getEmpList();
        list.add("John");
        List<String> list1 = empsNew1.getEmpList();
        list1.remove("Pankaj");

        System.out.println("emps List: "+emps.getEmpList()); //
        System.out.println("empsNew List: "+list); // +1
        System.out.println("empsNew1 List: "+list1); // -1
    }
}
