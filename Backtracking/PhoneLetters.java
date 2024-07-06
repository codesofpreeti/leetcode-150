package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PhoneLetters {
    public List<String> letterCombinations(String digits) {
        List<String> op = new ArrayList();
        String map[] = { "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        backtracks(digits, "", map, op);
        return op;
    }

    public void backtracks(String digits, String combo, String[] map, List<String> op) {
        if(digits.isEmpty()){
            op.add(combo);
        }
        else{
            String letters=map[digits.charAt(0-'2')];
            for(char letter: letters.toCharArray()){
                backtracks(digits.substring(1), combo+letter, map, op);// starts by taking substring from idx 1 always so that we cut down on the string to reach the base condition
            }
        }
    }
}
