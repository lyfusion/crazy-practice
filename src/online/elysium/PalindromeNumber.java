package online.elysium;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        long reserved = 0;
        int temp = x;

        while (temp > 0) {
            reserved = reserved * 10 + temp % 10;
            temp /= 10;
        }

        return (int)reserved == x;
    }
}
