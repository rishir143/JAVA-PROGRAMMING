package Loop;

import java.util.Scanner;

public class Print_1_to_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        while(n>0){
            System.out.println(num++);
            n--;
        }
        System.out.println();
        int m = sc.nextInt();
        for(int i = 1; i <=m; i++){
            System.out.println(i);
        }
    }

}
