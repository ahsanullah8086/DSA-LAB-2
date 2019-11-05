import java.util.*;
public class SixthTask{

	public static void main(String[] args) {
		
		int[][] matrix = {
							{35, 0, 5, 7, 24},
							{11,20, 5, 30, 1},
							{10, 5, 44, 100, 0},
							{101, 4, 48, 45, 1},
							{88, 78, 91, 32, 2}
						};
			
		for( int a=0; a<matrix.length; a++ ){
			for(int x=0; x<matrix.length; x++){
				for(int y=0; y<matrix.length-(x+1); y++){
					if( matrix[a][y] > matrix[a][y+1] ){
						int temp = matrix[a][y];
						matrix[a][y] = matrix[a][y+1];
						matrix[a][y+1] = temp;
					}

				}
			}
		}
		
		for( int x=0; x<matrix.length; x++){ 
			System.out.print(Arrays.toString(matrix[x]));
		}

	}
}