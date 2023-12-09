public class WordSentenceCounter {
    public static void main(String[] args) {
        // Hardcoded text for analysis
        String inputText = "This is a sample text. It has multiple sentences and words. How many can you count?";

        int wordCount = countWords(inputText);
        int sentenceCount = countSentences(inputText);

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of sentences: " + sentenceCount);
    }

    private static int countWords(String text) {
        int count = 0;
        boolean isWord = false;

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                isWord = true;
            } else if (Character.isWhitespace(c) || c == '\n' || c == '\t') {
                if (isWord) {
                    count++;
                    isWord = false;
                }
            }
            // You may need to adjust the conditions based on your specific requirements.
        }

        // Check if the last word is counted
        if (isWord) {
            count++;
        }

        return count;
    }

    private static int countSentences(String text) {
        int count = 0;

        for (char c : text.toCharArray()) {
            if (c == '.' || c == '!' || c == '?') {
                count++;
            }
        }

        return count;
    }
}
