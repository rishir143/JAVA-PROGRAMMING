package OOPS;
class Vehicle{
    int wheels;
    int speed;
    int seats;
}
class PowerVehicle extends Vehicle{
    int engine;
}
class AirCraft extends PowerVehicle{
    int rotors;
}
class Animal{
    int size;
    boolean isVegetarian;
}
class Birds extends Animal{
    int maximumAltitude;
}
class AquaticAnimal extends Animal{
    int fins;
}

public class Inheritance2 {
    public static void main(String[] args) {
        Vehicle cycle = new Vehicle();
    }
}
