import java.util.Arrays;
class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] % 2 == 0) {
                left++;
            } 
            else if (nums[right] % 2 != 0) {
                right--;
            } 
            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }
        return nums;
    }
    public static void main(String[] args) {
        SortArrayByParity sol = new SortArrayByParity();
        int[] testArray = {3, 1, 2, 4};
        System.out.println("Original Array: " + Arrays.toString(testArray));
        int[] result = sol.sortArrayByParity(testArray);
        
        System.out.println("Sorted by Parity: " + Arrays.toString(result));
    }
}
