package objectClass;

class Employee implements Cloneable {
    int id;
    String name;
    Address address;

    public Employee() {
    }

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee employee = (Employee) super.clone();
        employee.address = (Address) employee.address.clone();
        return employee;
    }
}