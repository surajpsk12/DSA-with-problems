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
