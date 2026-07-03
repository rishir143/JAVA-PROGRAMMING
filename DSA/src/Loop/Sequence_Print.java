package Loop;

public class Sequence_Print {
    public static void main(String[] args) {
        int num = 5;
        for(int i = 1; i <= num; i++){
            System.out.println(i);
            if(i == 5) continue;
            System.out.println(num - i);

        }
    }
}
