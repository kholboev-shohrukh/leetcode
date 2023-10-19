package easy.palindrome_number;

public class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }

        int p = 0;
        int l = x;
        while(x != 0){
            p = x % 10 + p * 10;
            x /= 10;
        }
        return p == l;
    }
}
