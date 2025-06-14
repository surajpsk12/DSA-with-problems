public class Maximum_Subarray {
    // question = https://leetcode.com/problems/maximum-subarray/description/
    public int kadanesalgo(int arr[]){
        int currsum = 0;
        int maxsum = 0;

        for ( int i=0;i<arr.length;i++){
            currsum=Math.max(arr[i] , currsum+arr[i]);
            maxsum=Math.max(currsum,maxsum);
            
        }
        return maxsum;
    }

    // question = also print the subarray with max sum 
    public int maxsumarray( int arr[]){
        int cs=arr[0];
        int ms=arr[0];

        int start = 0 , temp = 0 , end = 0;
        for( int i=0;i<arr.length;i++){
            if(arr[i]>cs+arr[i]){
                cs=arr[i];
                temp = i;
            } else {
                cs+=arr[i];
            }


            if(cs>ms){
                ms=cs;
                start=temp;
                end=i;
            }
        }
        return ms; 
    }
}
/*
---

## 💡 Core Idea — Kadane’s Algorithm

Kadane’s algorithm is based on **dynamic programming**, and follows this key idea:

### 🔄 At each index `i`, you decide:

* Should I **extend** the previous subarray (`cs + nums[i]`)?
* Or **start a new subarray** from here (`nums[i]`)?

You always choose the **maximum** of the two:


cs = Math.max(cs + nums[i], nums[i]);

Then update your `ms` (max sum so far):

ms = Math.max(ms, cs);
---

## ⏱️ Time & Space Complexity

| Metric | Value                      |
| ------ | -------------------------- |
| Time   | O(n)                       |
| Space  | O(1) (no extra array used) |

---

## 🧩 Pattern

Kadane’s is a **DP / Greedy hybrid pattern** often used in:

* Maximum sum problems
* Minimum sum subarrays
* Stock buy/sell variants
* Longest positive subarray / product problems

---


 */