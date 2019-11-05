import java.util.*;
public class SecondTask{

	public static void main(String[] args) {
		
		int[] intArray1 = {1, 2, 3, 4, 5, 6};
		int[] intArray2 = {1, 2, 3, 4, 5, 6}; 

		System.out.println("Are Equal: " + Arrays.equals(intArray1, intArray2));

		int[] intArray3 = {1, 2, 2, 4, 84, 6};
		int[] intArray4 = {1, 2, 3, 4, 5, 6};

		System.out.print("Are Equal: " + Arrays.equals(intArray3, intArray4));		
	}
}