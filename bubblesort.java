package demo;


class shellSort{

	public int sort(int[] a) {
		int n = a.length;
		for (int gap = n/2; gap > 0; gap /= 2)
        {
            
            for (int i = gap; i < n; i += 1)
            {
               
                int temp = a[i];
 
          
                int j;
                for (j = i; j >= gap && a[j - gap] > temp; j -= gap)
                { 
                	a[j] = a[j - gap];
               
                }
                a[j] = temp;
                }
		}
		return 0;
	}
	
	
	void printValues(int a[]) {
		int  n = a.length;
		for(int i: a)
			System.out.print(i+" ");
	}
	
	
}

public class bubblesort {
public static void main(String[] args) {
	int a[] = {0,5,1,4,2,8};

	
	shellSort sh = new shellSort();
	
	System.out.println("Values before unsorted");
	sh.printValues(a);
	sh.sort(a);
	System.out.println("\nValues after sorted");
	sh.printValues(a);

	

	}
	
	

}
