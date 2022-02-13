public class TwoSumII {
    public static void main(String... args) {
        /*
            Leetcode: 167
            Input: numbers = [2,7,11,15], target = 9
            Output: [1,2]
        */

        int[] result = solution(new int[] { 2, 7, 11, 15 }, 9);

        for (int element : result) {
            System.out.println(element);
        }
    }

    public static int[] solution(int[] sortedArray, int target) {
        //Two pointers technique

        int left = 0;
        int right = sortedArray.length - 1;

        while(left < right) {
            int sum = sortedArray[left] + sortedArray[right];

            if (sum == target) {
                return new int[] { left + 1, right + 1};
            } else  if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[] { -1, -1 };
    }
}
