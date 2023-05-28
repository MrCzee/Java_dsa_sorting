package demo;

public class bubble {
	public static void main(String[] args) {
		int a[] = {2,4,5,3,6};
		
		buble(a);
		for(int i: a)
			System.out.println(i+" ");
	}

	private static void buble(int[] a) {

     
		int n = a.length;
		
		for(int i = 0 ;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
                if(a[j]>a[j+1])
                {
    				int temp = a[j];
    				a[j] = a[j+1];
    				a[j+1] = temp;

                }
			}
		}
	}

}
