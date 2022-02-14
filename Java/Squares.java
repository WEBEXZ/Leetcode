public class Squares {
    /*
        Leetcode: 977
        Input: nums = [-4,-1,0,3,10]
        Output: [0,1,9,16,100]
    */

    public static void main(String... args) {
        int[] result = solution(new int[] { -4, -1, 0, 3, 10 });

        for (int element : result) {
            System.out.println(element);
        }
    }

    public static int[] solution(int[] array) {
        //Two pointers technique

        int left = 0;
        int right = array.length - 1;
        int[] output = new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            if (Math.abs(array[left]) > Math.abs(array[right])) {
                output[i] = array[left] * array[left];
                left++;
            } else {
                output[i] = array[right] * array[right];
                right--;
            }
        }

        return output;
    }
}