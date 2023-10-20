package easy.plus_one;

public class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        if(length == 1 && digits[0] == 0){
            return new int[]{1};
        }
        int n = 0, l = 0;
        digits[length - 1] += 1;
        for (int i=length - 1; i > 0; --i){
            l = digits[i] + n;
            digits[i] = (digits[i] + n) % 10;
            n = l / 10;
        }
        l = digits[0] + n;
        digits[0] = (digits[0] + n) % 10;
        if(l % 10 == 0){
            int[] result = new int[length + 1];
            result[0] = 1;
            for (int i = 1; i <= length; i++){
                result[i] = digits[i - 1];
            }
            return result;
        }

        return digits;
    }
}
