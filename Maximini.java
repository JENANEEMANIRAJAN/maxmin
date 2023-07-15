package max_min;

import java.util.Scanner;

public class Maximini {

	public static int maxArr(int arr[]) {
		int[] arr1 = null;
		int size = arr1.length;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for(int i=0; i<size; i++) {
			if(arr1[i]>max) {
				max = arr1[i];
			}
			if(arr1[i]>min) {
						min = arr1[i];
					}
				
			}
		return max + min;
		}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int n = 0;
		int arr[] = new int[n];
		for(int i=0; i<arr.length; i++);
		{
			arr[n] = sc.nextInt();		}
		int max = maxArr(arr);
		System.out.println(max);
		
	}

}
