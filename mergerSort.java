package demo;

public class mergerSort {
 static void divide(int[] arr, int si, int ei) 
	{
		if(si>=ei) {
			return;
		}
		
		int mid = si+(ei-si)/2; 
		divide(arr,si, mid); 
		divide(arr, mid+1, ei); 
		
		conquer(arr,si,mid, ei);
		
	}
	
private static void conquer(int[] arr, int si, int mid, int ei) 
   {
	
	// new array
	int marged[] = new int[ei-si+1];
	
	int ind1 = si;
	int ind2 = mid+1;
	int x = 0;
	
	
	while(ind1 <= mid && ind2 <=ei) { // 0(n)
      
		if(arr[ind1]<= arr[ind2])
       {
   		marged[x++] = arr[ind1++];// cng
   		
       }
       else {
      		marged[x++] = arr[ind2++];
       }
       
	}
	
	while(ind1<=mid)
	{
  		marged[x++] = arr[ind1++];
	}

	while(ind2<=ei)
	{
  		marged[x++] = arr[ind2++];
	}
	
	
	
	// print 

	
	 for(int i= 0, j=si;  i<marged.length; i++,j++) {
		 
		  arr[j] = marged[i];
	 
	    }
	}

public static void main(String[] args) {
	
	int arr[] = {9,3,8,11,48, 55, 33};
	
	int n = arr.length;
	
	divide(arr, 0, n-1);
	
	
	// printing values
	
	for(int i: arr)
		System.out.println(i+" ");
	
//	for(int i=0;i<n;i++)
//	{
//		System.out.println(aar[i]+" ");
//	}
	System.out.println();
	
}


}
