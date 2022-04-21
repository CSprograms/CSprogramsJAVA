/**
* SSASC Practical 01
* Sorting Array Elements
*/

package SSASC_JAVA;

import java.util.Scanner;
import java.util.Arrays;
class SortArray {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the Array Size : ");
		int size = input.nextInt();
		
		int[] array = new int[size];
		
		for(int loop=0; loop < size; ++loop) {
			System.out.printf("array[%d] : ",loop);
			array[loop] = input.nextInt();
		}
		
		input.close();
		System.out.println("Array Befor Sorting : " + Arrays.toString(array));
  
        Arrays.sort(array);
  
        System.out.println("Array After Sorting : " + Arrays.toString(array));
	}
}