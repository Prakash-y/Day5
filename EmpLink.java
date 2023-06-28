package Day5;

import java.util.LinkedList;

public class EmpLink {

	public static void main(String[] args) {
		Employee emp1 = new Employee(18, "Prakash", "Engg.", 200000);
		Employee emp2 = new Employee(25, "Pankaj", "Sales", 150000);
		Employee emp3 = new Employee(10, "Rahul", "marketing", 300000);
		
		LinkedList<Object> L1 = new LinkedList<>();
		
		L1.add(emp1);
		L1.add(emp2);
		L1.add(emp3);
		
		for(Object e : L1)
		{
			System.out.println(e);
			
		}
		
	}
}
