package day6.prime;

import java.util.Scanner;

public class PrimeGame {

	static Scanner sc = new Scanner(System.in);

	public static int[] getArray(int size) {

		int[] arr = new int[size];
		System.out.println("Enter array elements");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		return arr;
	}

	public static int[] addTwoArray(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length];

		for (int i = 0; i < result.length; i++) {
			result[i] = arr1[i] + arr2[i];
		}

		return result;
	}
	
	public static int sumOfLastDigits(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum+= arr[i] % 10;
		}
		
		return sum;
	}
	
	public static boolean isPrime(int n)
	{
		boolean result=false;
		int count=0;
		
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		
		if(count==1)
		{
			result =true;
		}
		
		
		return result;
	}
	

	public static void main(String[] args) {

		int[] arr1;
		int[] arr2;
		int[] arr3;
		boolean result;
		int size1, size2;

		System.out.println("Enter the size of First Array");
		size1 = sc.nextInt();
		if (size1 <= 0) {
			System.out.printf("%d is an invalid array size", size1);
			return;
		}

		arr1 = getArray(size1);

		System.out.println("Enter the size of Scond Array");
		size2 = sc.nextInt();

		if (size2 <= 0) {
			System.out.printf("%d is an invalid array size", size2);
			return;
		}

		if (size1 != size2) {
			System.out.println("Both array size is different");
			return;
		}

		arr2 = getArray(size2);

		arr3 = addTwoArray(arr1, arr2);
		
		int sum = sumOfLastDigits(arr3);
		
		
		result = isPrime(sum);
		
	//	System.out.println(sum + "is not a prime number");
	
		if(result)
		System.out.printf("%d is a prime number",sum);
		else
			System.out.printf("%d is not a prime number",sum);
		
		

	}

}
