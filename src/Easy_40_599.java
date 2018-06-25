import java.util.*;

/**
 * Created by akapandaroad on 2018-06-20.
 * Suppose Andy and Doris want to choose a restaurant for dinner,
 * and they both have a list of favorite restaurants represented by strings.
 * <p>
 * You need to help them find out their common interest with the least list index sum.
 * If there is a choice tie between answers, output all of them with no order requirement.
 * You could assume there always exists an answer.
 * <p>
 * Example 1:
 * Input:
 * ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 * ["Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"]
 * Output: ["Shogun"]
 * Explanation: The only restaurant they both like is "Shogun".
 * Example 2:
 * Input:
 * ["Shogun", "Tapioca Express", "Burger King", "KFC"]
 * ["KFC", "Shogun", "Burger King"]
 * Output: ["Shogun"]
 * Explanation: The restaurant they both like and have the least index sum is "Shogun" with index sum 1 (0+1).
 */
public class Easy_40_599 {

    public static void main(String[] args) {

        String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2 = {"KFC", "Shogun", "Burger King"};

        findRestaurant(list1, list2);


    }


    public static void findRestaurant(String[] list1, String[] list2) {

        ArrayList<String> list = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int index = 0;
        HashMap<String, Integer> map = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        for (int i = 0; i < list2.length; i++) {
//            if (map.containsKey(list2[i])) {
//                   min=Math.min(min,map.getOrDefault(list2[i], 0) + i);
//                }
            if (map.containsKey(list2[i])) {
                map2.put(list2[i], map.get(list2[i]) + i);
                min = Math.min(min, map.getOrDefault(list2[i], 0) + i);
            }
        }

        for (Map.Entry<String, Integer> entry : map2.entrySet()) {

            if (min == entry.getValue()) {
                list.add(entry.getKey());
            }
        }


        String[] result=new String[list.size()];
        for (int i = 0; i <list.size() ; i++) {
            result[i]=list.get(i);
        }


        System.out.println(list.toArray());
    }
}










