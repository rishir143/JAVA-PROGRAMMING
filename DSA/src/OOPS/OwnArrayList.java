package OOPS;

class ArrayList{
    int[] arr;
    int idx = 0;
    int size = 0;
    ArrayList(int capacity){
        arr = new int[capacity];
    }
    void add(int ele){
        if(arr.length == size){
            capacityIncrease();
        }
        arr[idx] = ele;
        idx++;
        size++;
    }
    void removeFromEnd(){
        idx--;
        size--;
    }
    void capacityIncrease(){
        int[] arr2 = new int[arr.length * 2];
        for (int i = 0; i < arr.length ; i++) {
            arr2[i] = arr[i];
        }
        arr = arr2;
     }
     int capacity(){
        return arr.length;
     }
     int get(int index){
        return arr[index];
     }
     void set(int index, int val){
        arr[index] = val;
     }
     void display(){
         for (int i = 0; i < arr.length; i++) {
             System.out.print(arr[i] + " ");
         }
         System.out.println();
     }


}

public class OwnArrayList {
    public static void main(String[] args) {
        ArrayList list = new ArrayList(3);
        list.add(3); list.add(4); list.add(9);
        list.display();
        System.out.println(list.get(1));
        list.add(4);
        list.add(2);
        list.add(90);
        list.display();

    }
}
