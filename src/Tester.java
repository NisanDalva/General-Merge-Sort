import java.util.Arrays;


public class Tester {
	public static void main(String[] args) {
		Integer[] arrInt = { 7,50,2,3,1,4,9,10,15,8,5,46};
		Person[] arrPerson = {new Person("ddd", 5), new Person("ccc", 3), new Person("aaa", 7)
				, new Person("aaa", 1), new Person("bbb", 3), new Person("eee", 10)
				, new Person("aaa", 20), new Person("ccc", 4), new Person("aaa", 2)};
		
		
		MergeSort<Integer> sortInt = new MergeSort<Integer>(arrInt);
		
		System.out.println("only indexes 0 to 3 is sorted:");
		sortInt.sort(0, 3);
		System.out.println(Arrays.toString(arrInt));
		
		sortInt.sort(arrInt);
		System.out.println("entire array of integers is sorted:");
		System.out.println(Arrays.toString(arrInt));
		
		
		System.out.println("\n\n");
		//-------------------------------------
		
		
		MergeSort<Person> sortPerson = new MergeSort<Person>(arrPerson);
		
		System.out.println("only indexes 0 to 3 is sorted:");
		sortPerson.sort(0, 3);
		System.out.println(Arrays.toString(arrPerson));
		
		sortPerson.sort(arrPerson);
		System.out.println("entire array of persons is sorted:");
		System.out.println(Arrays.toString(arrPerson));
		
	}
	
}


