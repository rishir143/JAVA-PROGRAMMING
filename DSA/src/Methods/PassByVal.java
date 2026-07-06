package Methods;

public class PassByVal {
    public static void change(int n ){
        int x = 6;
    }
    public static void main(String[] args) {
        int x = 6;
        System.out.println(x);
        change(6);
        System.out.println(x);
    }
}
