public class DAY5 {
    public static void main(String[] args) {
int[] num = {12,34,53,16,47,89,0,4,3};
int elem = 47;
        System.out.println(linearSearch(num, elem));

    }

    static int linearSearch (int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
 int element = arr[i];
 if(element == target){
     return i;
 }
        }
        return -1;
    }

}
