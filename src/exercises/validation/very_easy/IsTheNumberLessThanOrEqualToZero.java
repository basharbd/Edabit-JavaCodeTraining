package exercises.validation.very_easy;

/**
 *
 *Is the Number Less than or Equal to Zero?
 * Create a method that takes an integer as its only argument and returns true if it's less than or equal to zero,
 * otherwise return false.
 *
 * Examples
 * lessThanOrEqualToZero(5) ➞ false
 *
 * lessThanOrEqualToZero(0) ➞ true
 *
 * lessThanOrEqualToZero(-2) ➞ true
 * Notes
 * Don't forget to return the result.
 * If you get stuck on a challenge, find help in the Resources tab.
 * If you're really stuck, unlock solutions in the Solutions tab.
 */
public class IsTheNumberLessThanOrEqualToZero {
    public static void main(String[]args)
    {
        System.out.println(lessThanOrEqualToZero(5));
    }
    public static boolean lessThanOrEqualToZero(int a)
    {
        if (a==0 || a>0){
            return true;}
        else {
            return false;}
    }
}
