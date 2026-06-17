package DSA.src.HashMap;

import java.util.HashSet;
import java.util.Scanner;

public class LongestNonRepeatingSubstring {
    public static int LongestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int i = 0, j = 0, max =0;
        while (j<n){
            char ch = s.charAt(j);
            if(!set.contains(ch)){
                set.add(ch);
                j++;
            }
            else{
                int len = j - i;
                max = Math.max(max, len);

                while(s.charAt(i) != ch){
                    set.remove(s.charAt(i));
                    i++;
                }
                i++;
                j++;
            }
        }
        int len = j - i;
        max = Math.max(max, len);
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(LongestSubstring(s));

    }

    }
