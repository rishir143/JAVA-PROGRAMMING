package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PowerSet {
    public List<String> powerSet(String s) {
        List<String> result = new ArrayList<>();
        powerSet("" , 0, s, result);
        Collections.sort(result);
        return result;

    }
    private void powerSet(String ans, int indx, String s, List<String> result){
        if(indx == s.length()){
            if(ans.length() != 0) result.add(ans);
        }
        char ch = s.charAt(indx);
        powerSet(ans + ch, indx + 1, s, result);
        powerSet(ans, indx + 1, s, result);
    }
}
