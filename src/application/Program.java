package application;

import java.util.Arrays;
import java.util.List;



public class Program {
	
	public static void main(String[] args) {
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		System.out.println();
		
		List<String> myString = Arrays.asList("Maria", "Pedro", "Jo�o");
		printList(myString);
		
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
			System.out.println(obj);
		}
	}

}
