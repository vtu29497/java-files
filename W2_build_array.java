public class W2_build_array {

    public int[] buildArray(int[] nums) {

        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[nums[i]];
        }

        return temp;
    }

    public static void main(String[] args) {

        W2_build_array obj = new W2_build_array();

        int[] nums = {0, 2, 1, 5, 3, 4};

        int[] result = obj.buildArray(nums);

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
