
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

