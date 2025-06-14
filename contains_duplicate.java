import java.util.HashSet;
import java.util.Set;

public class contains_duplicate {
    // question = https://leetcode.com/problems/contains-duplicate/

    public boolean  checkduplicate(int arr[]){
        Set<Integer> hset = new HashSet<>();
        for(int i:arr){
            if(!hset.add(i)){
                return true;
            }
        }
            return false;
    }
}
/*
 * 💡 Core Idea
Use a HashSet to track elements we've already seen.

Set Property:
A Set only contains unique elements.

set.add(x) returns false if x already exists.

So, while iterating:

If add(i) returns false → i is a duplicate → return true.

⏱️ Time and Space Complexity
Complexity	Value
Time	O(n)
Space	O(n) (worst-case, all unique elements stored)

🧠 Pattern
This is an example of the “Use a Set to track seen elements” pattern, useful in:

Finding duplicates

Detecting cycles

Solving unique pair/sum problems


 */