public class Container {
    /*
        Leetcode: 11
        Input: height = [1,8,6,2,5,4,8,3,7]
        Output: 49
    */

    public static void main(String... args) {
        int result = solution(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 });

        System.out.println(result);
    }

    public static int solution(int[] array) {
        //Two pointers technique

        int left = 0;
        int right = array.length - 1;
        int max_area = 0;

        while (left < right) {
            max_area = Math.max(max_area, 
                Math.min(array[left], array[right]) * (right - left));

            if (array[left] > array[right]) {
                right--;
            } else {
                left++;
            }
        }

        return max_area;
    }
}