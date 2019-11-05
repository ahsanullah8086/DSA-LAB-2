import java.util.*;

public class ThirdTask{

	public static void main(String[] args) {
		String[] names = {"Saad", "Ahmed", "Hammad", "Babar", "Usama", "Imran"};
		System.out.println(Arrays.toString(names));
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));

		String[] companies = {"Dell", "Hp", "Microsoft", "Amd", "Intel", "Asus", "Lenovo"};
		Arrays.sort(companies, 1, 4);
		System.out.println(Arrays.toString(companies));

		Arrays.fill(companies, 1,4, "null");
		System.out.println(Arrays.toString(companies));

		String[] surNames = {"Rajpoot", "Mughal", "Panhwar", "Khizri", "Baloch", "Laghari", };
		System.out.println(Arrays.equals(names, surNames));

		String[] shortListed = Arrays.copyOf(names, 3);
		System.out.println(Arrays.toString(shortListed));
		
		String[] shortListed2 = Arrays.copyOfRange(names, 2,4);
		System.out.println(Arrays.toString(shortListed2));

	}

}