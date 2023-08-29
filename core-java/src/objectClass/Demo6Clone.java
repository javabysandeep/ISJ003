package objectClass;

public class Demo6Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address oldAddress = new Address();
        oldAddress.id = 1;
        oldAddress.city = "Pune";
        oldAddress.country = "India";
        Address newAddress = (Address) oldAddress.clone();
        System.out.println(oldAddress);
        System.out.println(newAddress);

        Address address3 = newAddress;// we are doing reference copy, no new object is created

    }
}
