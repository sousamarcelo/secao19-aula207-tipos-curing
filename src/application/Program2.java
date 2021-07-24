package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Princípio get/put
 * 		covariância => get ok / put error
 * 		contravariância => get error / put ok
 * 
 * Problema 2 (princípio get/put)
 * Vamos fazer um método que copia os elementos de uma lista para uma
 * outra lista que pode ser mais genérica que a primeira.
 */

public class Program2 {
	
	public static void main(String[] args) {
		
		List<Integer> myInteger = Arrays.asList(1, 2, 3, 4);
		List<Double> myDouble = Arrays.asList(3.14, 6.28);
		List<Object> myObjs = new ArrayList<Object>();
		
	}

}
