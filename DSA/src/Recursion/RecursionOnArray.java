package Recursion;

public class RecursionOnArray {
    public static boolean exits(int[] arr, int target, int indx){
        if(indx == arr.length) return false;
        if(target == arr[indx]) return true;
        return exits(arr, target, indx + 1);
    }
    public static void print(int[] arr, int indx){
        if(indx == arr.length) return;
        System.out.print(arr[indx]+ " ");
        print(arr, indx + 1);
    }
    public static void main(String[] args) {
int[] arr = {1, 3 , 5, 7, 7, 9,0};
int target = 9;
//        System.out.println(exits(arr, target, 0));
        print(arr, 0);
    }


}
