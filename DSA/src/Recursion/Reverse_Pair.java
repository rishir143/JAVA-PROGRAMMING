package Recursion;

public class Reverse_Pair {
    static int count;

    public void inversion(int[] a, int[] b){
        int i = 0, j =0;
        while(i < a.length && j <b.length){
            if( (long)a[i] > (long)2*(long)b[j]){
                count += a.length - i;
                j++;
            }
            else i++;
        }
    }

    public int reversePairs(int[] nums) {
        count = 0;
        merge(nums);
        return count;
    }


    public void merge(int[] arr){
        int n = arr.length;
        if(n == 1) return;
        int[] a = new int[n/2];
        int[] b = new int[n - n/2];
        int idx = 0;
        for (int i = 0; i < a.length; i++) a[i] = arr[idx++];
        for (int i = 0; i < b.length ; i++) {
            b[i] = arr[idx++];
        }
        merge(a);
        merge(b);

        inversion(a, b);

        mergeSort(a, b, arr);

    }
    private void mergeSort(int[] a, int[] b, int[] c){
        int i = 0, j = 0, k = 0;
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]) c[k++] = a[i++];
            else {

                c[k++] = b[j++];
            }
        }
        while(i < a.length) c[k++] = a[i++];
        while(j < b.length) c[k++] = b[j++];
    }

}
