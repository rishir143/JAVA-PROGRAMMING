public class LinearSearch {
    public static void main(String[] args) {

        System.out.println(search("Rishi" , 'i'));

    }
    static boolean search(String str, char target){
        if(str.isEmpty()){
            return false;
        }
        for (char s : str.toCharArray()){
            if(target == s){
                return true;
            }

        }
        return false;
    }
}
