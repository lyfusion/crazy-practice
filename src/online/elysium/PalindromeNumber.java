package online.elysium;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        long reservedHalf = 0;
        int temp = x;

        while (temp > reservedHalf) {
            reservedHalf = reservedHalf * 10 + temp % 10;
            temp /= 10;
        }

        return temp == reservedHalf || temp == reservedHalf / 10;
    }
}
