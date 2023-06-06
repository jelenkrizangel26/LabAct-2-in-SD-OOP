public class PalindromeChecker {
    public static void main(String[] args) {
        String original = "racecar";
        String reversed = "";
        
        System.out.println("\u001B[32m************* Palindrome Checker *************\u001B[0m");

        int origLength = original.length();

        for (int i = (origLength - 1); i >=0; --i) {
            reversed = reversed + original.charAt(i);
        }

        if (original.toLowerCase().equals(reversed.toLowerCase())) {
            System.out.println();
            System.out.println(original + " is a Palindrome String.");
        }
        else {
            System.out.println();
            System.out.println(original + " is not a Palindrome String.");
        }
        System.out.println("\u001B[32m**********************************************\u001B[0m");
    }
}