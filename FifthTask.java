import java.util.*;
public class FifthTask{
	
	public static int secondLargest(int[] intArray){
		int[] tempArray = intArray;
		for(int x=intArray.length; x>=1; x--){
			for(int y=0; y<x-1; y++ ){
				if( intArray[y] > intArray[y+1] ){
					int temp = intArray[y];
					intArray[y] = intArray[y+1];
					intArray[y+1] = temp; 
				}
			}
		}

		return intArray.length-2;
	}

	public static void main(String[] args) {
		int[] hey = {12, 45, 0, 89, 69, 100, 1000};
		System.out.println(Arrays.toString(hey));
		System.out.println("secondLargestIndex: " + FifthTask.secondLargest(hey));

	}
} 