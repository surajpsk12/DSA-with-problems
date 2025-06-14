public class Search_in_Rotated_Sorted_Array {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) return mid;

            // Check if left half is sorted
            if (nums[low] <= nums[mid]) {
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;  // move left
                } else {
                    low = mid + 1;   // move right
                }
            } else { // Right half is sorted
                if (nums[mid] < target && target <= nums[high]) {
                    low = mid + 1;   // move right
                } else {
                    high = mid - 1;  // move left
                }
            }
        }

        return -1; // Not found
    }
}
/*
 * 🔍🔁 Concept: Modified Binary Search
Since the array is rotated, one half is always sorted.

So at every step, you:

Find the mid

Decide whether left half or right half is sorted

Use that to discard half the array

⏱️ Time and Space Complexity
Metric	Value
Time	O(log n)
Space	O(1)

🧩 Pattern
This is a variation of binary search and is part of the search space reduction category of problems.


 */