package main;

import java.util.*;
import java.util.stream.Stream;

/**
 * @author bkariuki
 */
public class AlertService {


    static String[] uniqueNames(String[] names1, String[] names2) {
        List<String> list1 = new ArrayList<>(Arrays.asList(names1));
        List<String> list2 = new ArrayList<>(Arrays.asList(names2));
        List<String> res = new ArrayList();
        for (String name : list1) {
            if (list2.contains(name)) {
                list2.remove(name);
            }
        }
        res =  Stream.of(list1, list2).collect(ArrayList::new, List::addAll, List::addAll);
        System.out.println("res ************** "+res);
        String[] fin = (String[]) res.toArray(String[]::new);
        return fin;
    }

    public static void main(String[] args) {
        String[] names1 = new String[]{"Ava", "Emma", "Olivia"};
        String[] names2 = new String[]{"Olivia", "Sophia", "Emma"};
        System.out.println(Arrays.asList(uniqueNames(names1, names2)));
    }
}
