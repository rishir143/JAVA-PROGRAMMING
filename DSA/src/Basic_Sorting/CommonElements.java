package Basic_Sorting;

public class CommonElements {
    public static void main(String[] args) {
        int[] a = {8, 5, 5, 3,1, 6,3,0};
        int[] b = {5, 3,9, 4,34,2};
        int size = Math.min(a.length, b.length);
        int k = 0;
        int[] c = new int[size];
        for (int i = 0; i < a.length ; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]){
                    c[k++] = a[i];
                }
            }

        }
        for(int ele : c){
            System.out.print(ele+ " ");
        }
    }
}
