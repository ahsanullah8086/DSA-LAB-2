import java.util.*;
public class SeventhTask{

	public static void main(String[] args) {
		
		int[] intArray = {10, 10, 30, 20, 20, 70,10,90};
		int temp;
		System.out.println("Given Array: " + Arrays.toString(intArray));
		int count=1;
		for( int x=0; x<intArray.length; x++ ){
			temp = intArray[x];
			for( int y=x+1; y<intArray.length; y++ ){
				if(intArray[x] == intArray[y]){
					for(int a=y; a<intArray.length-1; a++){
						intArray[a] = intArray[a+1];
					}
				}
			}
		}

		for(int i=0; i<intArray.length-1; i++){
			if( intArray[i] == intArray[i+1] ){
				break;
			}else{
				count++;
			}
		}
		System.out.println(Arrays.toString(intArray));
		System.out.println("Length Of new Array is \"" + count + "\" with no duplicate items.");
	
	}
}