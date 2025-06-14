public class Reverse_an_Array {
    
    //https://www.geeksforgeeks.org/program-to-reverse-an-array/
    public void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
    }
}
/*
 * 


## 💡 **Core Idea**:

Use **two pointers**:

* One at the **start**
* One at the **end**

Swap their values, then move:

* `start → right`
* `end → left`

Repeat until `start >= end`.

✅ This is the classic **two-pointer approach** to reverse an array **in-place**.

---

## ⏱️ Time and Space Complexity:

| Metric | Value           |
| ------ | --------------- |
| Time   | O(n)            |
| Space  | O(1) (in-place) |

---

## 🧠 Pattern:

This is a **classic use of the Two-Pointer Technique**.
It’s also a building block for:

* Reversing strings
* Rotating arrays
* Reversing parts of arrays in problems like **Rotate by K**, **Reverse Words in Sentence**, etc.

---

## 🧾 Summary:

| Feature      | Description                            |
| ------------ | -------------------------------------- |
| Concept      | Two-pointer in-place swap              |
| Goal         | Reverse the array without extra memory |
| Pattern      | Two pointers (start/end)               |
| Applications | Rotations, string/array reversal       |

---

 */