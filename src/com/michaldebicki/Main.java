package com.michaldebicki;

public class Main {
    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int lastDigit;
        int n = number;
        while (n != 0)
        { reverse *= 10;
            lastDigit= n %10;
            n /= 10;
            reverse += lastDigit;
        }
        System.out.println(number);
        System.out.println(reverse);
        return reverse == number;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(21));
        System.out.println(isPalindrome(10991));
        System.out.println(isPalindrome(-21));
        System.out.println(isPalindrome(-1));
        System.out.println(isPalindrome(1));
    }
}

