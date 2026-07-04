package Loop;

public class SumOfDigit {
    public static void main(String[] args) {
        int n = 687987;
        int sum = 0;
        int digit = 0;
        while(n != 0){
            digit = n % 10;
            sum+= digit;
            n /=10;
        }
        System.out.println(sum);
    }
}
