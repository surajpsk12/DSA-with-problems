import java.util.ArrayList;
import java.util.Collections;

public class chocolate_distribution_problems {
    // question : https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1

    public int findMinDiff(ArrayList<Integer> arr, int m) {
        if(arr.size()<m) return -1;
        
        Collections.sort(arr);
        
        
        int mindiff = Integer.MAX_VALUE;
        
        for(int i =0;i<=arr.size() - m ; i++){
            int diff=arr.get(i+m-1)-arr.get(i);
            mindiff=Math.min(mindiff,diff);
        }
        
        return mindiff;
        
    }
}
/*
 * 💡 Core Idea:
This is a sliding window problem after sorting.

Steps:
Sort the array

For every subarray (or window) of size m, calculate:

arr[i + m - 1] - arr[i]
Return the minimum of all these differences.

⏱️ Time & Space Complexity:
Metric	Value
Time	O(n log n) (due to sorting)
Space	O(1)

✅ Why It Works (Greedy Logic):
Sorting ensures that the closest values are adjacent, so the best possible minimum difference for m students must be within one of the sorted m-sized windows.

🔁 Pattern Used:
Sliding window on a sorted array

Greedy choice — pick the window with minimum range


 */