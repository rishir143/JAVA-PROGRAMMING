package OOPS;
class Car{
 String name; // null
private int price; // 0
Car(){ // default constructor

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

    void printf(){
        int price = 12;
        System.out.println(this.price+" "+name);
    }

}
public class Constructors {
    public static void main(String[] args) {
        Car c1 = new Car("Honda Amaze", 1000000);
        c1.print();

        Car c2 = new Car(150000, "Alto");
        c2.printf();

        Car c3 = new Car();
        c3.name = "Honda Amaze";
        c3.print();
    }
}
