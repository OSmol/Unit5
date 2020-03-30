package my;

import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		ArrayList<Integer> numbers=new ArrayList<Integer>();
		ArrayList<Integer> evens=new ArrayList<Integer>();
		
		numbers=getMass();
		evens=getEven(numbers);
		if(evens.size()==0) {
	        System.out.println("Четных чисел в последовательности нет");
		}
	}
	
	public static Integer getK() {
		int k=0;
		Scanner sc = new Scanner(System.in); 
        System.out.println("Введите натуральное число ");
		if (sc.hasNext()) { 
			k=sc.nextInt();
			}
		if(k==0) {
			k=getK();
		}
		return k;
	}
	
	public static ArrayList<Integer> getMass() {
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		int lenght=0;
		int min = 10; 
	    int max = 10; 
        System.out.println("Задайте длину массива (введите натуральное число больше 0): ");
        lenght=getK();
	    for(int i=0;i<lenght;i++) {
		    int x = min + (int) (Math.random() * max);
		    numbers.add(x);
	    }
		return numbers;
	}
	
	public static ArrayList<Integer> getEven(ArrayList<Integer> mass) {
		ArrayList<Integer> evens=new ArrayList<Integer>();
		for(int i=0;i<mass.size();i++) {
			if(mass.get(i)%2==0) {
				evens.add(mass.get(i));
		        System.out.println(mass.get(i));
			}
		}
		return evens;
	}

}
