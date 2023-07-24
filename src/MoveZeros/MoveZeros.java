package MoveZeros;

import java.util.*;

public class MoveZeros {
	
	public static void zero(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == 0)
			{
				arr = moveZeros(arr,i);
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static int[] moveZeros(int[] arr,int i)
	{
		for(int k=i;k<arr.length-1;k++)
		{
			arr[k] = arr[k+1];
		}
		arr[arr.length-1] = 0;
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i] = scan.nextInt();
		}
		zero(arr);
	}

}
