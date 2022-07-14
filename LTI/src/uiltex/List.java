package uiltex;

import java.util.*;
import java.util.stream.Stream;
public class List {
	public static void main(String[] args) {
		System.out.println("how many records do u want to store?");
		
		Scanner sc=new Scanner(System.in);
		
		int rec=sc.nextInt();
		ArrayList<Employees> l= new ArrayList<Employees>(); //generics jdk1.5
		for(int i=0; i<rec;i++) {
			int no=sc.nextInt();
			String name=sc.next();
			int sal=sc.nextInt();
			Employees e=new Employees(no, name, sal);
			l.add(e);
			
	//		Stream<Employees> e1=l.parallelStream().filter(e->e.salary<5000);
			
//			System.out.println(l.get(i).getEno());
//			System.out.println(l.get(i).getEname());
//			System.out.println(l.get(i).getSalary());
		}
		
		for(Employees em:l) { //foreach or enhanced for loop
			if(em.getSalary()<5000) { //if we want sal<5000
			System.out.println(em.getEno());
			System.out.println(em.getEname());
			System.out.println(em.getSalary());
			}
		} 
	}

}
