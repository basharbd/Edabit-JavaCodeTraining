package exercises.validation.very_easy;

/**
 * Check if an Integer is Divisible By Five
 * Create a function that returns true if an integer is evenly divisible by 5, and false otherwise.
 *
 * Examples
 * divisibleByFive(5) ➞ true
 *
 * divisibleByFive(-55) ➞ true
 *
 * divisibleByFive(37) ➞ false
 * Notes
 * Don't forget to return the result.
 * If you get stuck on a challenge, find help in the Resources tab.
 * If you're really stuck, unlock solutions in the Solutions tab.
 */
public class CheckIfAnIntegerIsDivisibleByFive {
    public static void main (String[] args){
        System.out.println(divisibleByFive(11));
    }
    public static boolean divisibleByFive(int a){
        return a%5==0;

    }
}
