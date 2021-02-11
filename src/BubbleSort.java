import java.util.Scanner;
public class BubbleSort {

	public static void main(String[] args) 
	{
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}

		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		
		System.out.println("The Sorted Array is \n");
		{
			int i;
			i=0;
			
			for(i ;i<n; )
			{
				System.out.println(arr[i]);
				i++;
			}
		}
	}

}