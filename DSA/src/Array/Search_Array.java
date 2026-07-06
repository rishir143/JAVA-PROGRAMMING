package Array;

public class Search_Array {
    public static int search(int[] arr, int target){
        int index = -1;
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]) {
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4 , 6, 7, 54, 34, 23, 9};
       int result = search(arr,34);
        System.out.println(result);

    }
}
