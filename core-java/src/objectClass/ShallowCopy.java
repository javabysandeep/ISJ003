package objectClass;

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address(1,"Pune","India");
        Employee employee1 = new Employee(1,"Abc",address);
        Employee employee2 = (Employee) employee1.clone();

        System.out.println("Before changes");
        System.out.println(employee1);
        System.out.println(employee2);

        System.out.println("After changes");
        employee1.address.id = 102;
        employee1.address.city = "Mumbai";
        employee1.address.country = "India";
        System.out.println(employee1);
        System.out.println(employee2);
    }
}
