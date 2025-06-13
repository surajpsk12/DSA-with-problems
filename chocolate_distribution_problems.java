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
