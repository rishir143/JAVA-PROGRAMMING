package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringBasics {
    public static void main(String[] args) {
        String name = "Rishi";
        change(name);
        System.out.println(name);
        String[] names = {"Ayush", "Manoj", "Harish"};
        System.out.println(Arrays.toString(names));
        List<String> al = new ArrayList<>();
        al.add("Rishi");
        al.add("Raj");
        al.add("Choubey");
        al.add("Ayush");
        al.add("Manoj");
        System.out.println(al);
        change2(al);
        System.out.println(al);

    }

     private static void change2(List<String> name){
         name.add("Anish");
     }
    private static void change(String name){
        name = "hfhgfh";
    }
}
