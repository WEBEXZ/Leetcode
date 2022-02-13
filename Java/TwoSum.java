import java.util.Map;
import java.util.HashMap;

public class TwoSum {
    /*
        Leetcode: 1
        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
    */

    public static void main(String... args) {
        int[] result = solution(new int[] { 2, 7, 11, 15 }, 9);

        for (int element : result) {
            System.out.println(element);
        }
    }

    public static int[] solution(int[] array, int target) {
        Map<Integer, Integer> dictionary = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            int complement = target - array[i];

            if (dictionary.containsKey(complement)) {
                return new int[] { dictionary.get(complement), i };
            } else {
                dictionary.put(array[i], i);
            }
        }

        return new int[] { -1, -1 };
    }
}