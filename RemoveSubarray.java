/*Question1 : Given an integer array arr, remove a subarray (can be empty) from the array such that the remaining elements in arr are non-decreasing.
A subarray is a contiguous subsequence of the array.
Return the length of the shortest subarray to remove.
Example 1:
Input: arr = [1,2,3,10,4,2,3,5]
Output: 3
Explanation: The shortest subarray we can remove is [10,4,2]
of length 3. The remaining elements after that will be
[1,2,3,3,5] which are sorted.
Another correct solution is to remove the subarray [3,10,4].
*/
import java.util.Scanner;
class RemoveSubarray{
	 public static int lengthOfShortestSubarray(int[] arr,int n) {
        int left = 0;
		int right = n - 1;
        while(left + 1 < n && arr[left] <= arr[left+1]) 
		{
			left++;
        }
		if(left == n - 1) 
			return 0;
       
        while(right > left && arr[right-1] <= arr[right]) 
		{
			right--;
		}
		if(right==0)
			return n-1;
		
        int min = (n-left-1) < right? n-left-1: right;
        int i = 0;
        int j = right;
        while(i <= left && j < arr.length)
		{
            if(arr[j] >= arr[i]) {
                min = min < (j-i-1)? min : j-i-1;
                i++;
            }
			else {
                j++;
            }   
        }
        return min;
    }
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]a=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
	
		System.out.print(lengthOfShortestSubarray(a,n));
	}
}
