package lesson35;

import java.util.*;

public class Main {
    static void main() {
        WordUtils wordUtils = new WordUtils();

        List<String> words = new ArrayList<>();

        // The Mykola ate an apple
        words.add("The");
        words.add("Mykola");
        words.add("ate");
        words.add("an");
        words.add("apple");

        String shortestWord =
                wordUtils.getShortestWord(words);

        System.out.println("Shortest word: " + shortestWord);


        String sentence = "Mykola ate a cucumber and a tomato and a carrot ";

        Set<String> uniqueWords = wordUtils.getUniqueWordsFromSentence(sentence);

        System.out.println(uniqueWords);
        // uniqueWords -> "Mykola", "ate", "a", "cucumber", "and", "tomato", "carrot" (in any order)

        String sentence2 = "today was a very great day a very nice weather and I was very happy";
        Set<String> duplicatedWords = wordUtils.getDuplicatedWordsFromSentence(sentence2);
        System.out.println(duplicatedWords);

        Set<String> mySet = new HashSet<>();
        boolean res1 = mySet.add("Mykola");
        boolean res2 = mySet.add("Mykola");
        System.out.println("res1 -> " + res1);
        System.out.println("res2 -> " + res2);

        String sentence3 = "today was a very great day a very nice weather and I was very happy";
        Map<String, Integer> wordsCount3 = wordUtils.getWordsCount(sentence3);
        System.out.println(wordsCount3);
    }
}
