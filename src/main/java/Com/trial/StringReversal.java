package Com.trial;


public class StringReversal {

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = charArray.length - 1;

        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move pointers
            left++;
            right--;
        }

        return new String(charArray);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Test cases from the original problem
        String[] testCases = {
                "hello",
                "JavaScript",
                "12345",
                "A man a plan a canal Panama"
        };

        for (String test : testCases) {
            System.out.println("Original: " + test);
            System.out.println("Reversed: " + reverseString(test));
            System.out.println();
        }
    }
}
