public class FourthTask{

	static double returnAverage(double[] array){
		double sum = 0.0;
		for(int x=0; x<array.length; x++){
			sum+=array[x];
		}

		return sum/array.length;
	}

	public static void main(String[] args) {
		
		double[] floatArray = {10.0, 19.4, 30.6};
		System.out.println("Average: " + FourthTask.returnAverage(floatArray));

	}
}