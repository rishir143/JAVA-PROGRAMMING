package OOPS;

public class Polymorphism {
public static class Dog {
    void speak(){
        System.out.println("Bhau Bhau");
    }
    }
    public static class Cat{
    void speak(){
        System.out.println("Meow Meow");
    }

    }
    public static class Lion{
    void speak(){
        System.out.println("GRRRRRR");
    }

    }
    public static class Pikachu{
    void speak(){
        System.out.println("Pika Pika");
    }
}
    public static class Human{
    void speak(){
        System.out.println("Hello");
    }

        public static void main(String[] args) {
            Dog dugeshBhai = new Dog();
            Cat c = new Cat();
            Lion rishi = new Lion();
            Pikachu p = new Pikachu();
            Human H = new Human();

            dugeshBhai.speak();
            c.speak();
            rishi.speak();
            p.speak();
            H.speak();
        }
    }


}
