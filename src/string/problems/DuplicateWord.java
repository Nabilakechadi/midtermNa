package string.problems;
import java.util.*;
public class DuplicateWord {

    public static void main(String[] args) {



        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        String[] words = st.split("\\W");

        Map<String, Integer> word_map = new HashMap<>();

        for (String word : words) {

            if (word_map.get(word) != null) {
                word_map.put(word, word_map.get(word) + 1);
            }


            else {
                word_map.put(word, 1);
            }
        }

        Set<String> word_set = word_map.keySet();

        // We are iterating in word set
        for (String word : word_set) {


            if (word_map.get(word) > 1)


                System.out.println(word);
        }
    }
}
