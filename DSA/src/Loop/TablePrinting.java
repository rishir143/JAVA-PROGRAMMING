package Loop;

import java.util.Scanner;

public class TablePrinting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("TO PRINT THE TABLE");
        System.out.println("Enter The Number");
        int n = sc.nextInt();
//        for(int i = 1; i <= 10; i++){
//            System.out.printf(" %d * %d = %d %n",n,i,(n*i));
//        }
        int i = 1;
        while(n>=i){
            int k = 1;
            while(k<= 10){
                System.out.printf(" %d * %d = %d %n",i,k,(i*k));
                k++;
            }
            System.out.println();
            i++;
        }
    }
}
