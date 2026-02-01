package function;

import java.lang.reflect.Array;
import java.util.Arrays;

public class learnfun {
    public static void main(String[] args) {
        fun(43, 24, 23, 434, 442 );
        fun("rishi");
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 33;
        System.out.println(arr[1]);

    }
    static void fun(String name){
        System.out.println(name);
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
