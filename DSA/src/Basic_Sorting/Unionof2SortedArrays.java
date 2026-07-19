package Basic_Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Unionof2SortedArrays {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList<Integer> result = new ArrayList<>();
       int i = 0;
       int j = 0;
       int n = a.length;
       int m = b.length;

       while(i < n && j < m){
           if(a[i] < b[j]){
               if( result.isEmpty() || result.get(result.size() - 1) != a[i]){
                   result.add(a[i]);
               }
                   i++;
           }
           else if(a[i] > b[j]){
               if( result.isEmpty() || result.get(result.size() - 1) != b[j]){
                   result.add(b[j]);
               }
               j++;

           }
           else {
               if (result.isEmpty() || result.get(result.size() - 1) != a[i]) {
                   result.add(b[j]);

               }
               i++;
               j++;
           }
       }

           while(i < n){
               if( result.isEmpty() || result.get(result.size() - 1) != a[i]){
                   result.add(a[i]);
               }
               i++;
           }

        while(j < m){
            if( result.isEmpty() || result.get(result.size() - 1) != b[j]){
                result.add(b[j]);
            }
            j++;
        }

return result;
    }
}
