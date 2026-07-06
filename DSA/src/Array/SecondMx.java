package Array;

public class SecondMx {
    public static void main(String[] args) {
        int[] arr = {1, 2 , 3 , 8, 5, 4};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(max < arr[i]){
                secMax = max;
                max = arr[i];
            } else if (secMax < arr[i] && arr[i] < max) {
                secMax = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(secMax);
    }
}
