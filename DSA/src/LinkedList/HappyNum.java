package LinkedList;

public class HappyNum {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = getNum(slow);
            fast = getNum(getNum(fast));
        } while(slow != fast);

        return slow == 1;

    }
    public int getNum(int n){
        int totalsum = 0;

        while(n > 0){
            int digit = n % 10;
            totalsum += digit * digit;
            n = n/10;
        }
        return totalsum;
    }
}
