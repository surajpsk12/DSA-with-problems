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
