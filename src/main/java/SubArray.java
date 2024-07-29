
public class SubArray {
    /**
     * Return only a part of an array. For instance, given the array {1,2,3,4,5}, a sub array with start 1 and end 4
     * would result in {2,3,4}, because the starting index is inclusive, but the ending index is exclusive.
     *
     * You will need to create a new array whose size is only the amound of elements requested between the start and
     * end index, and then write a for loop which copies values from nums over to this new resulting array.
     *
     * @param nums an array of ints.
     * @param start the starting index, inclusive.
     * @param end the ending index, exclusive.
     * @return a sub-array of nums containing the values between start and end.
     */
    public int[] sub(int[] nums, int start, int end){
            // Check for valid input
            if (nums == null || start < 0 || end > nums.length || start >= end) {
                throw new IllegalArgumentException("Invalid start or end index.");
            }
            
            // Calculate the length of the new array
            int length = end - start;
            
            // Create the new array
            int[] subArray = new int[length];
            
            // Copy elements from the original array to the new array
            for (int i = 0; i < length; i++) {
                subArray[i] = nums[start + i];
            }
            
            return subArray;
        }
}
