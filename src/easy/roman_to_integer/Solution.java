package easy.roman_to_integer;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> romanNumbers = new HashMap<>();
        romanNumbers.put('I', 1);
        romanNumbers.put('V', 5);
        romanNumbers.put('X', 10);
        romanNumbers.put('L', 50);
        romanNumbers.put('C', 100);
        romanNumbers.put('D', 500);
        romanNumbers.put('M', 1000);
        int length = s.length();
        int result = romanNumbers.get(s.charAt(length - 1));

        for(int i = length - 2; i >= 0; --i){
            if(romanNumbers.get(s.charAt(i)) >= romanNumbers.get(s.charAt(i + 1))){
                result = result + romanNumbers.get(s.charAt(i));
            } else {
                result -= romanNumbers.get(s.charAt(i));
            }
        }

        return result;
    }
}
