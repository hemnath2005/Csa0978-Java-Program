import java.util.*;

public class ReverseAlphabeticalOrder {
    public static void main(String[] args) {
        String word = "example";
        
        // Convert the word to a character array
        Character[] chars = new Character[word.length()];
        for (int i = 0; i < word.length(); i++) {
            chars[i] = word.charAt(i);
        }
        
        // Sort the array in alphabetical order
        Arrays.sort(chars);
        
        // Reverse the array
        Arrays.sort(chars, Collections.reverseOrder());

        // Convert the array back to a string
        StringBuilder sortedWord = new StringBuilder(chars.length);
        for (char c : chars) {
            sortedWord.append(c);
        }
        
        System.out.println("Original word: " + word);
        System.out.println("Reversed alphabetically sorted word: " + sortedWord.toString());
    }
}