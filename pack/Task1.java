package my;
import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		int k=0;
		int sum;
		ArrayList<Integer> numbers=new ArrayList<Integer>();
		ArrayList<Integer> aliquots=new ArrayList<Integer>();
		k=getK();
		numbers=getMass();
		aliquots=getAliquot(numbers, k);
		if(aliquots.size()==0) {
	        System.out.println("Кратных чисел нет");
		}else if(aliquots.size()>0) {
			sum=getSum(aliquots);
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
	        System.out.println(x);
	    }
		return numbers;
	}
	
	public static ArrayList<Integer> getAliquot(ArrayList<Integer> mass, int k) {
		ArrayList<Integer> aliquots=new ArrayList<Integer>();
		for(int i=0;i<mass.size();i++) {
			if(mass.get(i)%k==0) {
				aliquots.add(mass.get(i));
			}
		}
		return aliquots;
	}
	
	public static Integer getSum(ArrayList<Integer> aliquots) {
		int sum=0;
		for(int i=0;i<aliquots.size();i++) {
			sum+=aliquots.get(i);
		}
        System.out.println("Сумма кратных чисел равна: "+sum);
		return sum;
	}

}
