package datastructure;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class UseMap {
    public static void main(String[] args) {
            Map<String, List<String>> list = new HashMap<String, List<String>>();
            list.put("IT", Collections.singletonList(("David, Jhon, Jessica")));
        list.put("HR", Collections.singletonList(("Melissa, Karen, Bryan")));


            for (String i : list.keySet()) {
                System.out.println("key: " + i + " value: " + list.get(i));
            }
        }
    }


