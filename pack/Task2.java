package my;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
    boolean nullIsPresent=false;
	ArrayList<Integer> numbers=new ArrayList<Integer>();
	ArrayList<Integer> indexes=new ArrayList<Integer>();
	
	numbers=getMass();
    
	for(int i=0;i<6;i++) {
		nullIsPresent=checking(numbers);
	    if(nullIsPresent) {
			indexes=getMassFromIndex(numbers);
			break;
	    }else if(nullIsPresent==false) {
	         {
	    		numbers.clear();
	    		numbers=getMass();
	        }
	    }
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
    int max = 100; 
    System.out.println("Задайте длину массива (введите натуральное число больше 0): ");
    lenght=getK();
    for(int i=0;i<lenght;i++) {
	    int x = (int) (Math.random() * max);
	    numbers.add(x);
        System.out.println(x);
    }
	return numbers;
 }

public static ArrayList<Integer> getMassFromIndex(ArrayList<Integer> mass) {
	ArrayList<Integer> indexes=new ArrayList<Integer>();
    for(int i=0;i<mass.size();i++) {
    	if(mass.get(i)==0) {
    		indexes.add(i);
            System.out.println("Индексы: "+i);
    	}
    }
	return indexes;
 }

public static Boolean checking(ArrayList<Integer> mass) {
		Boolean res=false;
	    for(int i=0;i<mass.size();i++) {
	    	if(mass.get(i)==0) {
	    		res=true;
	    	}
	    }
	return res;
	}
}
