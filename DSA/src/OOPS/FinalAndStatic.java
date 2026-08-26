package OOPS;
class Cricketer{
static String Country = "IND";
int runs;
String name;
double avg;
void print(){
    System.out.println(runs+" "+name+" "+avg);
}
static void greet(){
    System.out.println("Win Or lose : But everyone should play fair");
}
}
class VariableExample {
    // Final field (constant)
    final int THRESHOLD = 100;

    public void demonstrate() {
        final int MAX_LIMIT = 50;

        // MAX_LIMIT = 60; // ❌ Compilation Error: Cannot assign a value to final variable 'MAX_LIMIT'

        System.out.println("Limit: " + MAX_LIMIT);
    }
}

class Parent {
    // Final method cannot be overridden by child classes
    public final void displaySecurityPolicy() {
        System.out.println("Standard security rules enforced.");
    }
}

class Child extends Parent {
    // ❌ Compilation Error: displaySecurityPolicy() in Child cannot override displaySecurityPolicy() in Parent
    /*
    @Override
    public void displaySecurityPolicy() {
        System.out.println("Custom rules.");
    }
    */
}
public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer.greet();
        System.out.println(Cricketer.Country);
        Cricketer c1 = new Cricketer();
        c1.Country = "India";
        System.out.println(c1.Country);
        Cricketer c2 = new Cricketer();
        c1.Country = "ENG";
        System.out.println(c2.Country);

        c2.greet();
    }
}
