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
