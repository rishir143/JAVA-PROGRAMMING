package Array;

public class Missing_num {
    public static void main(String[] args) {
        int[] arr = {0, 2, 4, 5};

        long n = arr.length + 1;
        long sum = n*(n - 1)/2;
        long arrSum = 0;
        for(int ele : arr){
            arrSum += ele;
        }
        System.out.println(arrSum + " " + sum);
    }
}
