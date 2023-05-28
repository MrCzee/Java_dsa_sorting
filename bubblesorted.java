package demo;

public class bubblesorted {
public static void main(String[] args) {
	
	int a[] = {1,5,2,5,2};
	
	bubblee(a);
}

private static void bubblee(int[] a) {

	int n = a.length;
	
	for(int i=0;i<n-1;i++)
		for(int j=0;j<n-i-1; i++)
		{
			int temp = a[j];
	        a[j] = a[j+1];
	        a[j+1] = temp;
		}	
	
}
}
