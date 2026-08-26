package OOPS;
class Address {
    String city;
    Address(String city) { this.city = city; }
}

class Person implements Cloneable {
    String name;
    Address address;

    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Default Object.clone() performs a shallow copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ShallowCopy {

    //remaining
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("New York");
        Person p1 = new Person("Alice", addr);

        // Perform Shallow Copy
        Person p2 = (Person) p1.clone();

        // 1. Modifying a primitive/immutable top-level field (Does NOT affect original)
        p2.name = "Bob";

        // 2. Modifying a referenced object field (AFFECTS BOTH)
        p2.address.city = "London";

        System.out.println(p1.name + " lives in " + p1.address.city); // Output: Alice lives in London
        System.out.println(p2.name + " lives in " + p2.address.city); // Output: Bob lives in London
    }
}
