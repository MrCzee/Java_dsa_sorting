package demo;


public class testInsertion {
public static void main(String[] args) {
	System.out.println("===============");

	System.out.println("Insertion Sort");
	
	System.out.println("===============\n");


	int a[] = {7,2,4,1,5,3};
	int n = a.length;
	
	System.out.println("UnSorted Group");

	for(int i : a) {
		System.out.print(i+" ");
	}
	
	insertionSort(a);
	
	
	System.out.println("\nSorted Group");
	for(int i : a) {
		System.out.print(i+" ");
	}
}

private static void insertionSort(int[] a) {

	int n = a.length;
	
	for(int i = 1; i<n;i++ )
	{
		int value = a[i]; //7 
		
		int hole = i; // 1
		
		while(hole > 0 && a[hole-1] > value)
		{
		
			 a[hole] = a[hole-1];
			 hole--;
		}
		
		a[hole] = value;
		
		
	}
	
	
	
}
}
