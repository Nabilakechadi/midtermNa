package datastructure;
import java.util.*;

public class UseMap {
    public static void main(String[] args) {
            Map<String, List<String>> list = new HashMap<String, List<String>>();
            list.put("IT", Collections.singletonList(("David, Jhon, Jessica")));
        list.put("HR", Collections.singletonList(("Melissa, Karen, Bryan")));


            for (String i : list.keySet()) {
                System.out.println("key: " + i + " value: " + list.get(i));
            }
        System.out.println(" WITH ITERATOR");

        Iterator<String> it = list.keySet().iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        it = list.keySet().iterator();

        while (it.hasNext()) {
            if (it.next().contentEquals("HR"))
                it.remove();
        }
        it = list.keySet().iterator();
        System.out.println("AFTER REMOVING HR");
        while (it.hasNext()) {
            System.out.println(it.next());

        }

    }
    }


