package Recursion;

public class InversionCount {

        static int count;
        public int inversionCount(int arr[]) {
            count = 0;
            merge(arr);
            return count;

        }
        public static void merge(int[] arr){
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

            mergeSort(a, b, arr);

        }
        private static void mergeSort(int[] a, int[] b, int[] c){
            int i = 0, j = 0, k = 0;
            while(i < a.length && j < b.length){
                if(a[i] <= b[j]) c[k++] = a[i++];
                else {
                    count += a.length - i;
                    c[k++] = b[j++];
                }
            }
            while(i < a.length) c[k++] = a[i++];
            while(j < b.length) c[k++] = b[j++];
        }



    }
