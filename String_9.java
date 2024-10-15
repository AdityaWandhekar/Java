public class String_9 {
    // anagram word.

    public static void exist(String word1, String word2) {
        // boolean anagram = true;
        for (int i = 0; i < word1.length() - 1; i++) {

            System.out.println("i -----------> " + word1.charAt(i));
            System.out.println("i ---> " + word1.charAt(i + 1));

            // if (word1.charAt(i) != word2.charAt(i + 1)) {
            // anagram = false;
            
            // }
        }
    // if (anagram) {
    // System.out.println("its a anagram!...");

    // } else {
    // System.out.println("its not a anagram!...");

    public static void main(String[] args) {
        String word1 = "BDCECA";
        String word2 = "ABCCED";

        exist(word1, word2);
        // System.out.println(anagrem);
    }

}