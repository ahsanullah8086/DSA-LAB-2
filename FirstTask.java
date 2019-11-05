import java.util.*;
public class FirstTask{
	
	public static void main(String[] args) {
		int[] intArray = new int[100];
		for( int x=0; x<intArray.length; x++){

			intArray[x] = (int)(Math.random()*50);
		}	

		System.out.print(Arrays.toString(intArray));
		System.out.print(intArray.length);
	}
} 