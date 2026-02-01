public class FIndNo {
    public static void main(String[] args) {
        int n =876876;
        int count = 0;
        int SearchNo =8 ;
        int rem;
        while(n > 0){
            rem = n%10;
            if(rem == SearchNo){
                count++;
            }
            n =n/10;


        }
        System.out.println(count);
    }
}
