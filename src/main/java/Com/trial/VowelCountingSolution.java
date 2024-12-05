package Com.trial;
public class VowelCountingSolution {
    // Approach 1: Using Regular Expression
    public static int countVowels1(String str) {
        return str.replaceAll("[^aeiouAEIOU]", "").length();
    }

    // Approach 2: Using Character Array and Iteration
    public static int countVowels2(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if ("aeiouAEIOU".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    // Approach 3: Using Bitwise Optimization
    public static int countVowels4(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (char c : str.toCharArray()) {
            count += ((1 << (c - 'a')) & 0b10010000) != 0 ? 1 : 0;
        }
        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        String[] testCases = {
                "hello world",
                "The quick brown fox",
                "AEIOU",
                "Python Programming"
        };

        for (String test : testCases) {
            System.out.println("String: " + test);
            System.out.println("Vowel Count (Regex): " + countVowels1(test));
            System.out.println("Vowel Count (Char Array): " + countVowels2(test));
            System.out.println("Vowel Count (Bitwise): " + countVowels4(test));
            System.out.println();
        }
    }
}
