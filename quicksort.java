package demo;

public class quicksort {
public static void main(String[] args) {
	int a[] = {3,5,2,6,1};
	int n  = a.length;
	
	quicksort(a, 0, n-1);
	display(a);
	
}



private static void display(int[] a) {
	for(int i: a)
	System.out.println(i+" ");	
}



private static void quicksort(int[] a, int low, int high) {

	if(low<high)
	{
		int povit = portition(a,low,high);
		quicksort(a,low, povit-1);
		quicksort(a,povit+1, high);
		
	}
	
}

private static int portition(int[] a, int low, int high) {
	   
	int povit = a[high];
	int i = low-1;
	
	
	for(int j = low; j<high;j++)
	{
		if(a[j] < povit)
		{
		    i++;
			int temp; 
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
			
		
	}
	i++;
	int temp = a[i];
	a[i] = povit;
	a[high] = temp;
	return i;
}




}
