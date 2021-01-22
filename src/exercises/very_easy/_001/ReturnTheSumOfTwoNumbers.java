package exercises.very_easy._001;

/**
 * Create a method that takes two integers as arguments and return their sum.
 *
 * Examples
 * SumOfTwoNumbers(3, 2) ➞ 5
 *
 * SumOfTwoNumbers(-3, -6) ➞ -9
 *
 * SumOfTwoNumbers(7, 3) ➞ 10
 *
 * Notes
 * Don't forget to return the result.
 * If you get stuck on a challenge, find help in the Resources tab.
 * If you're really stuck, unlock solutions in the Solutions tab.
 */
public class ReturnTheSumOfTwoNumbers {

    public static void main(String[] args) {

        System.out.println(sum(3, 2));
    }

    public static int sum(int a, int b) {
        return a + b;
    }
}
