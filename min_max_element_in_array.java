
//https://www.geeksforgeeks.org/maximum-and-minimum-in-an-array/
public class min_max_element_in_array {
    
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        int max_element = Integer.MIN_VALUE;
        int min_element = Integer.MAX_VALUE;
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]<min_element){
                min_element = arr[i];
            }
            if(arr[i]>max_element){
                max_element = arr[i];
            }
        }
        return new Pair(min_element,max_element);
    }
}

/*

## 💡 **Core Idea / Concept**:

### ➤ **Linear Scan** to find min and max in a **single pass** (O(n) time, O(1) space).

Rather than using two separate loops to find min and max, we:

* Start with `min = ∞`, `max = -∞`
* Traverse the array **once**
* Update:

  * `min` if `arr[i] < min`
  * `max` if `arr[i] > max`

✅ **Single pass** + no extra space = optimal solution

---

---

## 🧠 Pattern Recognition:

This follows the **accumulator pattern**:

> You accumulate a result (min/max) as you iterate.

It's useful in many DSA problems where you're:

* Tracking sum, product, or range
* Finding extrema (min/max)

---

## 🚀 Time and Space Complexity:

* **Time**: O(n) → You visit each element once
* **Space**: O(1) → No extra memory used

---

## ✅ Summary:

| Feature      | Description                      |
| ------------ | -------------------------------- |
| Concept      | Single-pass comparison           |
| Pattern      | Accumulator (min/max tracking)   |
| Complexity   | O(n) time, O(1) space            |
| Common Usage | Subarray, sorting checks, bounds |

Let me know if you'd like to optimize it further (e.g., with **divide and conquer**) or convert it for a custom object.

 */