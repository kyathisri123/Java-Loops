package Loops;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(), reverse = 0, temp = num;
        while (temp > 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }
        System.out.println(num + " is " + (num == reverse ? "a palindrome." : "not a palindrome."));
        sc.close();
    }
}

