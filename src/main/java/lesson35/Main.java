package lesson35;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        WordUtils wordUtils = new WordUtils();
        List<String> words = new ArrayList<>();

        words.add("Yevhen");
        wordUtils.getShortestWord(words);


    }
}
