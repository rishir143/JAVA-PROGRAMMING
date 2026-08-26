package OOPS;
class Car{
private String name;
private int price;
Car(){

}
    Car(String name, int x){
    this.name = name;
    this.price = x;
    }

    Car(int price, String name){
    this.price = price;
    this.name = name;

    }
    void print(){

        System.out.println("""
                name : %s
                price : %d
                """.formatted(name, price));
    }

}
public class Constructors {
    public static void main(String[] args) {
        Car c1 = new Car("Honda Amaze", 1000000);
        c1.print();

        Car c2 = new Car(150000, "Alto");
        c2.print();
    }
}
