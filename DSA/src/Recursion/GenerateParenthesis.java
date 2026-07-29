package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        CheckParenthesis(n, 0, 0, "", ans);
        return ans;
    }
    public void CheckParenthesis(int n, int open, int close, String current, List<String> ans){
        if( current.length() ==2 * n){
            ans.add(current);
            return;
        }

        if(open < n){
            CheckParenthesis(n, open + 1, close, current, ans);
        }
    if(close < open) CheckParenthesis(n, open, close + 1, current, ans);

    }




}
