package lesson35;

import java.util.*;

public class WordUtils {

    public String getShortestWord(List<String> words) {
        // words = "The", "Mykola", "ate", "an", "apple"
        // words.size() = 5

        int shortestWordLength = 999999999; // shortestWordLength = 999999999
        String shortestWord = ""; // shortestWord = ""

        for (String word : words) {
            int wordLength = word.length();

            if (wordLength < shortestWordLength) {
                shortestWordLength = wordLength;
                shortestWord = word;
            }
        }

        // shortestWord = "an"
        return shortestWord;
    }

    public Set<String> getUniqueWordsFromSentence(String sentence) {
        // "Mykola ate a cucumber and a tomato and a carrot"


        String[] words = sentence.split(" ");

        return new HashSet<>(List.of(words));


    }

    public Set<String> getDuplicatedWordsFromSentence(String sentence) {
        //today was a very great day and a very nice weather and I was very happy
        String[] words = sentence.split(" ");

        Set<String> uniqueWords = new HashSet<>();
        Set<String> duplicatedWords = new HashSet<>();

        for ( String word : words) {
            boolean isNotDuplicate = uniqueWords.add(word);
            boolean isDuplicated = !uniqueWords.add(word);
            //result = false when word is duplicate
            if (isNotDuplicate) {

            } else {
                duplicatedWords.add(word);
            }
        }
        return duplicatedWords;


//        Set<String> duplicatedWords = new HashSet<>();
//
//        for (int currentWordIndex = 0; currentWordIndex < words.length; currentWordIndex++) {
//            String currentWord = words[currentWordIndex];
//            //iteretion 0 = "Today"
//            //iteration 1 = "was"
//            //....
//            //iteration 15 = "happy"
//
//            for (int anotherCurrentWordIndex = 0; anotherCurrentWordIndex < words.length; anotherCurrentWordIndex++) {
//                String anotherCurrentWord = words[anotherCurrentWordIndex];
//                // iteretion 0 = "Today"
//                //iteration 1 = "was"
//                //....
//                //iteration 15 = "happy
//                if(anotherCurrentWord == currentWord) {
//                    continue;
//                }
//
//                if (currentWord.equals(anotherCurrentWord)) {
//                    //found a dupl
//                    duplicatedWords.add(currentWord);
//                }
//            }
//
//        }
    }
    //K = word
    //v = counter
    public Map<String,Integer> getWordsCount(String sentence) {

        Map<String,Integer> wordsCount = new HashMap<>();
        String[] words = sentence.split(" ");

        for (String word : words) {

            wordsCount.put(word, wordsCount.getOrDefault(word, 0) + 1);
        }


        return  wordsCount;
    }
}
