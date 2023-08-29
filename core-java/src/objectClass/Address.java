package objectClass;

class Address implements Cloneable{
    int id;
    String city;
    String country;

    public Address(int id, String city, String country) {
        this.id = id;
        this.city = city;
        this.country = country;
    }

    public Address() {
    }

    @Override
    public String toString() {
        return "Address{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}