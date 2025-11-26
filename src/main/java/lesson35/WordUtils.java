package lesson35;

import java.util.List;

public class WordUtils {

    public String getShortestWord(List<String> words) {
        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            System.out.println(word);
        }
        return "";
    }

}
