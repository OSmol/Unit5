package my;

import java.util.ArrayList;
import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		
	    boolean isRise=false;
		ArrayList<Double> numbers=new ArrayList<Double>();
		
		numbers=getMass();
		for(int i=0;i<numbers.size();i++) {
			if((i+1)<numbers.size()) {
				if(numbers.get(i)<numbers.get(i+1)) {
					isRise=true;
				}else if(numbers.get(i)>numbers.get(i+1)) {
					isRise=false;
				    System.out.println("������������������ ����� �� ������������");
				    break;
				}
			}

		}
		if(isRise) {
		    System.out.println("������������������ ����� ������������");
		}
	    
	}
	
	public static Integer getK() {
		int k=0;
		Scanner sc = new Scanner(System.in); 
	    System.out.println("������� ����������� ����� ");
		if (sc.hasNext()) { 
			k=sc.nextInt();
			}
		if(k==0) {
			k=getK();
		}
		return k;
	}

	public static ArrayList<Double> getMass() {
		ArrayList<Double> numbers=new ArrayList<Double>();
		int lenght=0;
		int min = -10; 
	    int max = 100; 
	    System.out.println("������� ����� ������� (������� ����������� ����� ������ 0): ");
	    lenght=getK();
	    for(int i=0;i<lenght;i++) {
		    double x = min+Math.random() * max;
		    numbers.add(x);
	        System.out.println(x);
	    }
		return numbers;
	 }


}
