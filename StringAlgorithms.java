public class StringAlgorithms {

    /**
     * Challenge 1:
     * Write a method that takes a String 'word' and returns
     * a String where each character is placed on its own line.
     */
    public static String printCharacters(String word) {
        // TODO: Implement this method
        String lined = "";
        for(int i = 0; i < word.length(); i++) {
            lined = lined + word.substring(i, i + 1) + "\n";
        }
        return lined;
    }


    /**
     * Challenge 2:
     * Write a method that takes a String 'word' and returns
     * a new String with the characters reversed.
     */
    public static String reverseWord(String word) {
        // TODO: Implement this method
        String reversed = "";
        for(int i = 0; i < word.length(); i++) {
            reversed = reversed + word.substring((word.length() - i - 1), (word.length() - i));
        }
        return reversed;
    }


    /**
     * Challenge 3:
     * Write a method that takes a String 'sentence' and returns
     * the sentence with the first letter of each word capitalized.
     */
    public static String capitalizeString(String sentence) {
        // TODO: Implement this method
        for (int i = 0; i < sentence.length() - 2; i++) {
            if (sentence.substring(i, i + 1).equals(" ")) {
               if (!sentence.substring(i + 1, i + 2).equals(" ")) {
                  sentence = sentence.substring(0, i + 1) + sentence.substring(i + 1, i + 2).toUpperCase() + sentence.substring(i + 2, sentence.length());
               }
            }
            else if (i == 0) {
               sentence = sentence.substring(0, 1).toUpperCase() + sentence.substring(1);
            }
        }
        return sentence;
    }


    /**
     * Challenge 4:
     * Write a method that takes a String 'word' and returns true
     * if the word is a palindrome (ignoring case), false otherwise.
     */
    public static boolean detectPalindrome(String word) {
        // TODO: Implement this method
        if (word.equalsIgnoreCase(reverseWord(word))) {
            return true;
        }
        return false;
    }


    /**
     * Challenge 5:
     * Write a method that takes a String 'word' and returns the
     * first character that appears exactly once. If no such
     * character exists, return a space ' '.
     */
    public static char firstUniqueChar(String word) {
        // TODO: Implement this method
        return ' ';
    }


    /**
     * Main method:
     * Test each method at least once.
     */
    public static void main(String[] args) {

        // TODO: Add test calls for each challenge method
        
        System.out.println("\nTesting printCharacters:");
        // Example:
        // System.out.println(printCharacters("hello"));
        System.out.print(printCharacters("Hello"));

        System.out.println("\nTesting reverseWord:");
        // Example:
        // System.out.println(reverseWord("hello"));
        System.out.print(reverseWord("Hello"));

        System.out.println("\nTesting capitalizeString:");
        // Example:
        // System.out.println(capitalizeString("the quick brown fox"));
        System.out.print(capitalizeString("hi, cats are really cool"));

        System.out.println("\nTesting detectPalindrome:");
        // Example:
        // System.out.println(detectPalindrome("racecar"));
        System.out.print(detectPalindrome("tacocat"));

        System.out.println("\nTesting firstUniqueChar:");
        // Example:
        // System.out.println(firstUniqueChar("swiss"));
    }
}
